/**
 * <copyright>
 * </copyright>
 *
 * $Id: LobjPackageImpl.java,v 1.1 2006/11/23 06:12:09 mtaal Exp $
 */
package lobj.impl;

import lobj.AbstractContent;
import lobj.AccessControl;
import lobj.Address;
import lobj.Affiliation;
import lobj.Author;
import lobj.AuthorizationTypes;
import lobj.Block;
import lobj.BlockFolder;
import lobj.BlockMeta;
import lobj.Blocktype;
import lobj.Category;
import lobj.CorrBlock;
import lobj.Course;
import lobj.CourseMeta;
import lobj.Coursetype;
import lobj.DidacMeta;
import lobj.Domain;
import lobj.Edition;
import lobj.ExternalMetadata;
import lobj.FolderMeta;
import lobj.HypertextBlock;
import lobj.HypertextContent;
import lobj.InternalRef;
import lobj.Item;
import lobj.Language;
import lobj.LearningObject;
import lobj.LearningUnit;
import lobj.LobjFactory;
import lobj.LobjPackage;
import lobj.LuFolder;
import lobj.LuMeta;
import lobj.LuNode;
import lobj.Module;
import lobj.ModuleFolder;
import lobj.ModuleMeta;
import lobj.Node;
import lobj.Note;
import lobj.Person;
import lobj.Precognition;
import lobj.PresentationBlock;
import lobj.PublishInfo;
import lobj.Publisher;
import lobj.ResrcFile;
import lobj.ResrcFiletype;
import lobj.ResrcFolder;
import lobj.ResrcMeta;
import lobj.Sharednotes;
import lobj.SimpleDidacMeta;
import lobj.Source;
import lobj.Theme;
import lobj.ThemeNode;
import lobj.TitleMeta;
import lobj.User;
import lobj.Userauthorization;
import lobj.blockAudiofile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LobjPackageImpl extends EPackageImpl implements LobjPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypertextBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hypertextContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resrcFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass themeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass themeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resrcFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockAudiofileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resrcFiletypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affiliationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blocktypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDidacMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass didacMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userauthorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resrcMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharednotesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coursetypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precognitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

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
	 * @see lobj.LobjPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LobjPackageImpl() {
		super(eNS_URI, LobjFactory.eINSTANCE);
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
	public static LobjPackage init() {
		if (isInited) return (LobjPackage)EPackage.Registry.INSTANCE.getEPackage(LobjPackage.eNS_URI);

		// Obtain or create and register package
		LobjPackageImpl theLobjPackage = (LobjPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof LobjPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new LobjPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLobjPackage.createPackageContents();

		// Initialize created meta-data
		theLobjPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLobjPackage.freeze();

		return theLobjPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningObject() {
		return learningObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningObject_Id() {
		return (EAttribute)learningObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningObject_Timestamp() {
		return (EAttribute)learningObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningObject_Synchronized() {
		return (EAttribute)learningObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_BlockMeta() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_ExternalMetadata() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Source() {
		return (EReference)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_AccessControl() {
		return (EReference)blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypertextBlock() {
		return hypertextBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypertextBlock_HypertextContent() {
		return (EReference)hypertextBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractContent() {
		return abstractContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractContent_Heading() {
		return (EAttribute)abstractContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContent_Language() {
		return (EReference)abstractContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHypertextContent() {
		return hypertextContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHypertextContent_Content() {
		return (EAttribute)hypertextContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypertextContent_BlockAudiofile() {
		return (EReference)hypertextContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHypertextContent_ResrcFile() {
		return (EReference)hypertextContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockFolder() {
		return blockFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockFolder_FolderMeta() {
		return (EReference)blockFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockFolder_BlockFolder() {
		return (EReference)blockFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockFolder_Block() {
		return (EReference)blockFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockFolder_AccessControl() {
		return (EReference)blockFolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_TitleMeta() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Course() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrBlock() {
		return corrBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrBlock_PresentationBlock() {
		return (EReference)corrBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrBlock_TitleMeta() {
		return (EReference)corrBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_CourseMeta() {
		return (EReference)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_ExternalMetadata() {
		return (EReference)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Coursetype() {
		return (EReference)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_OutlineAsXml() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_Module() {
		return (EReference)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_CorrBlock() {
		return (EReference)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Childitems() {
		return (EReference)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_LuRef() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningUnit() {
		return learningUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningUnit_LuMeta() {
		return (EReference)learningUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningUnit_ExternalMetadata() {
		return (EReference)learningUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningUnit_TreeAsXml() {
		return (EAttribute)learningUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLearningUnit_LuFile() {
		return (EAttribute)learningUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningUnit_AccessControl() {
		return (EReference)learningUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLearningUnit_Item() {
		return (EReference)learningUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuFolder() {
		return luFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuFolder_FolderMeta() {
		return (EReference)luFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuFolder_LuFolder() {
		return (EReference)luFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuFolder_LearningUnit() {
		return (EReference)luFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuFolder_AccessControl() {
		return (EReference)luFolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModuleMeta() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ExternalMetadata() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_RootNode() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_ModuleFile() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_TreeAsXml() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_AccessControl() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleFolder() {
		return moduleFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleFolder_FolderMeta() {
		return (EReference)moduleFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleFolder_ModuleFolder() {
		return (EReference)moduleFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleFolder_Module() {
		return (EReference)moduleFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleFolder_AccessControl() {
		return (EReference)moduleFolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResrcFolder() {
		return resrcFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResrcFolder_FolderMeta() {
		return (EReference)resrcFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResrcFolder_ResrcFolder() {
		return (EReference)resrcFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResrcFolder_AccessControl() {
		return (EReference)resrcFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFolder_DeleteScheduled() {
		return (EAttribute)resrcFolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResrcFolder_ResrcFile() {
		return (EReference)resrcFolderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheme() {
		return themeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheme_SimpleDidacMeta() {
		return (EReference)themeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresentationBlock() {
		return presentationBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationBlock_Lod() {
		return (EAttribute)presentationBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentationBlock_Rendering() {
		return (EAttribute)presentationBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentationBlock_Block() {
		return (EReference)presentationBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Visible() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThemeNode() {
		return themeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThemeNode_Theme() {
		return (EReference)themeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThemeNode_Childnodes() {
		return (EReference)themeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuNode() {
		return luNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuNode_LearningUnit() {
		return (EReference)luNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResrcFile() {
		return resrcFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFile_File() {
		return (EAttribute)resrcFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFile_File_tn() {
		return (EAttribute)resrcFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFile_Originalextension() {
		return (EAttribute)resrcFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFile_Filesize() {
		return (EAttribute)resrcFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFile_ResrcHref() {
		return (EAttribute)resrcFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResrcFile_Accesscontrol() {
		return (EReference)resrcFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResrcFile_ResrcFiletype() {
		return (EReference)resrcFileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResrcFile_HypertextContent() {
		return (EReference)resrcFileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getblockAudiofile() {
		return blockAudiofileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getblockAudiofile_File() {
		return (EAttribute)blockAudiofileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getblockAudiofile_Originalextension() {
		return (EAttribute)blockAudiofileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getblockAudiofile_Filesize() {
		return (EAttribute)blockAudiofileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getblockAudiofile_ResrcHref() {
		return (EAttribute)blockAudiofileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getblockAudiofile_ResrcFiletype() {
		return (EReference)blockAudiofileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResrcFiletype() {
		return resrcFiletypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFiletype_FiletypeExtension() {
		return (EAttribute)resrcFiletypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFiletype_FiletypeDesc() {
		return (EAttribute)resrcFiletypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFiletype_Image() {
		return (EAttribute)resrcFiletypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFiletype_Applet() {
		return (EAttribute)resrcFiletypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFiletype_FiletypeImageSmall() {
		return (EAttribute)resrcFiletypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcFiletype_FiletypeImageBif() {
		return (EAttribute)resrcFiletypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessControl() {
		return accessControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControl_Owner() {
		return (EReference)accessControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessControl_LastModified() {
		return (EAttribute)accessControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControl_LastModifiedBy() {
		return (EReference)accessControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessControl_Status() {
		return (EAttribute)accessControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessControl_LastStatusChange() {
		return (EAttribute)accessControlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControl_LastStatusChangeBy() {
		return (EReference)accessControlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControl_Sharednotes() {
		return (EReference)accessControlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControl_Authorizes() {
		return (EReference)accessControlEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessControl_EditionHistory() {
		return (EReference)accessControlEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessControl_GlobalAccess() {
		return (EAttribute)accessControlEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Street() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Postcode() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_City() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_State() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Country() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Phone() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Fax() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Email() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Otheraddr() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffiliation() {
		return affiliationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffiliation_Shortaffil() {
		return (EAttribute)affiliationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffiliation_Jobtitle() {
		return (EAttribute)affiliationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffiliation_Orgname() {
		return (EAttribute)affiliationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffiliation_Orgdiv() {
		return (EAttribute)affiliationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffiliation_Address() {
		return (EReference)affiliationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthor() {
		return authorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthor_Credittype() {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthor_Person() {
		return (EReference)authorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthor_Address() {
		return (EReference)authorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthor_Email() {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockMeta() {
		return blockMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockMeta_Lod() {
		return (EAttribute)blockMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockMeta_Rendering() {
		return (EAttribute)blockMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockMeta_Blocktype() {
		return (EReference)blockMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockMeta_CreationDate() {
		return (EAttribute)blockMetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockMeta_LastModified() {
		return (EAttribute)blockMetaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockMeta_SimpleDidacMeta() {
		return (EReference)blockMetaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockMeta_DefLang() {
		return (EReference)blockMetaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlocktype() {
		return blocktypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlocktype_Name() {
		return (EAttribute)blocktypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlocktype_Description() {
		return (EAttribute)blocktypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlocktype_CreationDate() {
		return (EAttribute)blocktypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlocktype_StyleRef() {
		return (EAttribute)blocktypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlocktype_Domains() {
		return (EReference)blocktypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitleMeta() {
		return titleMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitleMeta_Language() {
		return (EReference)titleMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleMeta_Title() {
		return (EAttribute)titleMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseMeta() {
		return courseMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseMeta_DidacMeta() {
		return (EReference)courseMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseMeta_Hours() {
		return (EAttribute)courseMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseMeta_Lvanr() {
		return (EAttribute)courseMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseMeta_Columnfilterasxml() {
		return (EAttribute)courseMetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseMeta_Fromext() {
		return (EAttribute)courseMetaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseMeta_CreationDate() {
		return (EAttribute)courseMetaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseMeta_Lecturer() {
		return (EReference)courseMetaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseMeta_DefLang() {
		return (EReference)courseMetaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDidacMeta() {
		return simpleDidacMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleDidacMeta_Language() {
		return (EReference)simpleDidacMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDidacMeta_Title() {
		return (EAttribute)simpleDidacMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDidacMeta_Description() {
		return (EAttribute)simpleDidacMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDidacMeta_Keywords() {
		return (EAttribute)simpleDidacMetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDidacMeta() {
		return didacMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDidacMeta_Goal() {
		return (EAttribute)didacMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDidacMeta_Precognition() {
		return (EReference)didacMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Name() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_Description() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Blocktypes() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_CreationDate() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_ServerURL() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdition() {
		return editionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdition_EditionNumber() {
		return (EAttribute)editionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdition_EditedBy() {
		return (EAttribute)editionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdition_IsVersion() {
		return (EAttribute)editionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdition_LastVersionNumber() {
		return (EAttribute)editionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdition_Status() {
		return (EAttribute)editionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdition_EditionCreationDate() {
		return (EAttribute)editionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolderMeta() {
		return folderMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolderMeta_Title() {
		return (EAttribute)folderMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolderMeta_Description() {
		return (EAttribute)folderMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolderMeta_CreationDate() {
		return (EAttribute)folderMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuMeta() {
		return luMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuMeta_DidacMeta() {
		return (EReference)luMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuMeta_CreationDate() {
		return (EAttribute)luMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuMeta_Domain() {
		return (EReference)luMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuMeta_Authors() {
		return (EReference)luMetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuMeta_PublishInfo() {
		return (EReference)luMetaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuMeta_DefLang() {
		return (EReference)luMetaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserauthorization() {
		return userauthorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserauthorization_User() {
		return (EReference)userauthorizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserauthorization_AuthType() {
		return (EReference)userauthorizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Date() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_NoteAuthor() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Content() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Honorific() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Firstname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Surname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Contrib() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Affiliations() {
		return (EReference)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Personblurb() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublisher() {
		return publisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublisher_Publishername() {
		return (EAttribute)publisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublisher_Address() {
		return (EReference)publisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishInfo() {
		return publishInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishInfo_Edition() {
		return (EAttribute)publishInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishInfo_Pubdate() {
		return (EAttribute)publishInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublishInfo_Publisher() {
		return (EReference)publishInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishInfo_Pubsnumber() {
		return (EAttribute)publishInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishInfo_Releaseinfo() {
		return (EAttribute)publishInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResrcMeta() {
		return resrcMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcMeta_Filename() {
		return (EAttribute)resrcMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcMeta_Parameters() {
		return (EAttribute)resrcMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcMeta_Height() {
		return (EAttribute)resrcMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcMeta_Width() {
		return (EAttribute)resrcMetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcMeta_CreationDate() {
		return (EAttribute)resrcMetaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcMeta_LastModified() {
		return (EAttribute)resrcMetaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcMeta_Title() {
		return (EAttribute)resrcMetaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcMeta_Description() {
		return (EAttribute)resrcMetaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResrcMeta_Keywords() {
		return (EAttribute)resrcMetaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharednotes() {
		return sharednotesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharednotes_Notes() {
		return (EReference)sharednotesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoursetype() {
		return coursetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoursetype_Language() {
		return (EReference)coursetypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoursetype_Title() {
		return (EAttribute)coursetypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoursetype_Description() {
		return (EAttribute)coursetypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalMetadata() {
		return externalMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalMetadata_Ref() {
		return (EAttribute)externalMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalMetadata_File() {
		return (EAttribute)externalMetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Language() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Code() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Version() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrecognition() {
		return precognitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrecognition_Precog() {
		return (EAttribute)precognitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrecognition_InternalRefs() {
		return (EReference)precognitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalRef() {
		return internalRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalRef_Language() {
		return (EReference)internalRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalRef_Ref() {
		return (EAttribute)internalRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalRef_File() {
		return (EAttribute)internalRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalRef_Reftype() {
		return (EAttribute)internalRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleMeta() {
		return moduleMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleMeta_DidacMeta() {
		return (EReference)moduleMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleMeta_CreationDate() {
		return (EAttribute)moduleMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleMeta_Authors() {
		return (EReference)moduleMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleMeta_PublishInfo() {
		return (EReference)moduleMetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleMeta_DefLang() {
		return (EReference)moduleMetaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_Author() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Title() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Subtitle() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_PublishedIn() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_PublishedBy() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Date() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Pp() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationTypes() {
		return authorizationTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationTypes_AuthType() {
		return (EAttribute)authorizationTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationTypes_AuthTypeDesc() {
		return (EAttribute)authorizationTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationTypes_ReadOnly() {
		return (EAttribute)authorizationTypesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Loginname() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Password() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Firstname() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Lastname() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Matriculationnr() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Scn() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Icqnumber() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Icqpassword() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Entryasxml() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Languagenr() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Notificationprofileasxml() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Dossierasxml() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Photo() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Onlinestatus() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Onlinedate() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Datafilter() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Inchatsince() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Contchatdate() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Chatroomnr() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Fromext() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Lastlogindate() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Currlogindate() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Lastcoursematerialnr() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Lastcoursematerialviewnr() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Authenticateldap() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Photochanged() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Authorizations() {
		return (EReference)userEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobjFactory getLobjFactory() {
		return (LobjFactory)getEFactoryInstance();
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
		learningObjectEClass = createEClass(LEARNING_OBJECT);
		createEAttribute(learningObjectEClass, LEARNING_OBJECT__ID);
		createEAttribute(learningObjectEClass, LEARNING_OBJECT__TIMESTAMP);
		createEAttribute(learningObjectEClass, LEARNING_OBJECT__SYNCHRONIZED);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__BLOCK_META);
		createEReference(blockEClass, BLOCK__EXTERNAL_METADATA);
		createEReference(blockEClass, BLOCK__SOURCE);
		createEReference(blockEClass, BLOCK__ACCESS_CONTROL);

		hypertextBlockEClass = createEClass(HYPERTEXT_BLOCK);
		createEReference(hypertextBlockEClass, HYPERTEXT_BLOCK__HYPERTEXT_CONTENT);

		abstractContentEClass = createEClass(ABSTRACT_CONTENT);
		createEAttribute(abstractContentEClass, ABSTRACT_CONTENT__HEADING);
		createEReference(abstractContentEClass, ABSTRACT_CONTENT__LANGUAGE);

		hypertextContentEClass = createEClass(HYPERTEXT_CONTENT);
		createEAttribute(hypertextContentEClass, HYPERTEXT_CONTENT__CONTENT);
		createEReference(hypertextContentEClass, HYPERTEXT_CONTENT__BLOCK_AUDIOFILE);
		createEReference(hypertextContentEClass, HYPERTEXT_CONTENT__RESRC_FILE);

		blockFolderEClass = createEClass(BLOCK_FOLDER);
		createEReference(blockFolderEClass, BLOCK_FOLDER__FOLDER_META);
		createEReference(blockFolderEClass, BLOCK_FOLDER__BLOCK_FOLDER);
		createEReference(blockFolderEClass, BLOCK_FOLDER__BLOCK);
		createEReference(blockFolderEClass, BLOCK_FOLDER__ACCESS_CONTROL);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__TITLE_META);
		createEReference(categoryEClass, CATEGORY__COURSE);

		corrBlockEClass = createEClass(CORR_BLOCK);
		createEReference(corrBlockEClass, CORR_BLOCK__PRESENTATION_BLOCK);
		createEReference(corrBlockEClass, CORR_BLOCK__TITLE_META);

		courseEClass = createEClass(COURSE);
		createEReference(courseEClass, COURSE__COURSE_META);
		createEReference(courseEClass, COURSE__EXTERNAL_METADATA);
		createEReference(courseEClass, COURSE__COURSETYPE);
		createEAttribute(courseEClass, COURSE__OUTLINE_AS_XML);
		createEReference(courseEClass, COURSE__MODULE);

		itemEClass = createEClass(ITEM);
		createEReference(itemEClass, ITEM__CORR_BLOCK);
		createEReference(itemEClass, ITEM__CHILDITEMS);
		createEAttribute(itemEClass, ITEM__LU_REF);

		learningUnitEClass = createEClass(LEARNING_UNIT);
		createEReference(learningUnitEClass, LEARNING_UNIT__LU_META);
		createEReference(learningUnitEClass, LEARNING_UNIT__EXTERNAL_METADATA);
		createEAttribute(learningUnitEClass, LEARNING_UNIT__TREE_AS_XML);
		createEAttribute(learningUnitEClass, LEARNING_UNIT__LU_FILE);
		createEReference(learningUnitEClass, LEARNING_UNIT__ACCESS_CONTROL);
		createEReference(learningUnitEClass, LEARNING_UNIT__ITEM);

		luFolderEClass = createEClass(LU_FOLDER);
		createEReference(luFolderEClass, LU_FOLDER__FOLDER_META);
		createEReference(luFolderEClass, LU_FOLDER__LU_FOLDER);
		createEReference(luFolderEClass, LU_FOLDER__LEARNING_UNIT);
		createEReference(luFolderEClass, LU_FOLDER__ACCESS_CONTROL);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODULE_META);
		createEReference(moduleEClass, MODULE__EXTERNAL_METADATA);
		createEReference(moduleEClass, MODULE__ROOT_NODE);
		createEAttribute(moduleEClass, MODULE__MODULE_FILE);
		createEAttribute(moduleEClass, MODULE__TREE_AS_XML);
		createEReference(moduleEClass, MODULE__ACCESS_CONTROL);

		moduleFolderEClass = createEClass(MODULE_FOLDER);
		createEReference(moduleFolderEClass, MODULE_FOLDER__FOLDER_META);
		createEReference(moduleFolderEClass, MODULE_FOLDER__MODULE_FOLDER);
		createEReference(moduleFolderEClass, MODULE_FOLDER__MODULE);
		createEReference(moduleFolderEClass, MODULE_FOLDER__ACCESS_CONTROL);

		resrcFolderEClass = createEClass(RESRC_FOLDER);
		createEReference(resrcFolderEClass, RESRC_FOLDER__FOLDER_META);
		createEReference(resrcFolderEClass, RESRC_FOLDER__RESRC_FOLDER);
		createEReference(resrcFolderEClass, RESRC_FOLDER__ACCESS_CONTROL);
		createEAttribute(resrcFolderEClass, RESRC_FOLDER__DELETE_SCHEDULED);
		createEReference(resrcFolderEClass, RESRC_FOLDER__RESRC_FILE);

		themeEClass = createEClass(THEME);
		createEReference(themeEClass, THEME__SIMPLE_DIDAC_META);

		presentationBlockEClass = createEClass(PRESENTATION_BLOCK);
		createEAttribute(presentationBlockEClass, PRESENTATION_BLOCK__LOD);
		createEAttribute(presentationBlockEClass, PRESENTATION_BLOCK__RENDERING);
		createEReference(presentationBlockEClass, PRESENTATION_BLOCK__BLOCK);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__VISIBLE);

		themeNodeEClass = createEClass(THEME_NODE);
		createEReference(themeNodeEClass, THEME_NODE__THEME);
		createEReference(themeNodeEClass, THEME_NODE__CHILDNODES);

		luNodeEClass = createEClass(LU_NODE);
		createEReference(luNodeEClass, LU_NODE__LEARNING_UNIT);

		resrcFileEClass = createEClass(RESRC_FILE);
		createEAttribute(resrcFileEClass, RESRC_FILE__FILE);
		createEAttribute(resrcFileEClass, RESRC_FILE__FILE_TN);
		createEAttribute(resrcFileEClass, RESRC_FILE__ORIGINALEXTENSION);
		createEAttribute(resrcFileEClass, RESRC_FILE__FILESIZE);
		createEAttribute(resrcFileEClass, RESRC_FILE__RESRC_HREF);
		createEReference(resrcFileEClass, RESRC_FILE__ACCESSCONTROL);
		createEReference(resrcFileEClass, RESRC_FILE__RESRC_FILETYPE);
		createEReference(resrcFileEClass, RESRC_FILE__HYPERTEXT_CONTENT);

		blockAudiofileEClass = createEClass(BLOCK_AUDIOFILE);
		createEAttribute(blockAudiofileEClass, BLOCK_AUDIOFILE__FILE);
		createEAttribute(blockAudiofileEClass, BLOCK_AUDIOFILE__ORIGINALEXTENSION);
		createEAttribute(blockAudiofileEClass, BLOCK_AUDIOFILE__FILESIZE);
		createEAttribute(blockAudiofileEClass, BLOCK_AUDIOFILE__RESRC_HREF);
		createEReference(blockAudiofileEClass, BLOCK_AUDIOFILE__RESRC_FILETYPE);

		resrcFiletypeEClass = createEClass(RESRC_FILETYPE);
		createEAttribute(resrcFiletypeEClass, RESRC_FILETYPE__FILETYPE_EXTENSION);
		createEAttribute(resrcFiletypeEClass, RESRC_FILETYPE__FILETYPE_DESC);
		createEAttribute(resrcFiletypeEClass, RESRC_FILETYPE__IMAGE);
		createEAttribute(resrcFiletypeEClass, RESRC_FILETYPE__APPLET);
		createEAttribute(resrcFiletypeEClass, RESRC_FILETYPE__FILETYPE_IMAGE_SMALL);
		createEAttribute(resrcFiletypeEClass, RESRC_FILETYPE__FILETYPE_IMAGE_BIF);

		accessControlEClass = createEClass(ACCESS_CONTROL);
		createEReference(accessControlEClass, ACCESS_CONTROL__OWNER);
		createEAttribute(accessControlEClass, ACCESS_CONTROL__LAST_MODIFIED);
		createEReference(accessControlEClass, ACCESS_CONTROL__LAST_MODIFIED_BY);
		createEAttribute(accessControlEClass, ACCESS_CONTROL__STATUS);
		createEAttribute(accessControlEClass, ACCESS_CONTROL__LAST_STATUS_CHANGE);
		createEReference(accessControlEClass, ACCESS_CONTROL__LAST_STATUS_CHANGE_BY);
		createEReference(accessControlEClass, ACCESS_CONTROL__SHAREDNOTES);
		createEReference(accessControlEClass, ACCESS_CONTROL__AUTHORIZES);
		createEReference(accessControlEClass, ACCESS_CONTROL__EDITION_HISTORY);
		createEAttribute(accessControlEClass, ACCESS_CONTROL__GLOBAL_ACCESS);

		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__STREET);
		createEAttribute(addressEClass, ADDRESS__POSTCODE);
		createEAttribute(addressEClass, ADDRESS__CITY);
		createEAttribute(addressEClass, ADDRESS__STATE);
		createEAttribute(addressEClass, ADDRESS__COUNTRY);
		createEAttribute(addressEClass, ADDRESS__PHONE);
		createEAttribute(addressEClass, ADDRESS__FAX);
		createEAttribute(addressEClass, ADDRESS__EMAIL);
		createEAttribute(addressEClass, ADDRESS__OTHERADDR);

		affiliationEClass = createEClass(AFFILIATION);
		createEAttribute(affiliationEClass, AFFILIATION__SHORTAFFIL);
		createEAttribute(affiliationEClass, AFFILIATION__JOBTITLE);
		createEAttribute(affiliationEClass, AFFILIATION__ORGNAME);
		createEAttribute(affiliationEClass, AFFILIATION__ORGDIV);
		createEReference(affiliationEClass, AFFILIATION__ADDRESS);

		authorEClass = createEClass(AUTHOR);
		createEAttribute(authorEClass, AUTHOR__CREDITTYPE);
		createEReference(authorEClass, AUTHOR__PERSON);
		createEReference(authorEClass, AUTHOR__ADDRESS);
		createEAttribute(authorEClass, AUTHOR__EMAIL);

		blockMetaEClass = createEClass(BLOCK_META);
		createEAttribute(blockMetaEClass, BLOCK_META__LOD);
		createEAttribute(blockMetaEClass, BLOCK_META__RENDERING);
		createEReference(blockMetaEClass, BLOCK_META__BLOCKTYPE);
		createEAttribute(blockMetaEClass, BLOCK_META__CREATION_DATE);
		createEAttribute(blockMetaEClass, BLOCK_META__LAST_MODIFIED);
		createEReference(blockMetaEClass, BLOCK_META__SIMPLE_DIDAC_META);
		createEReference(blockMetaEClass, BLOCK_META__DEF_LANG);

		blocktypeEClass = createEClass(BLOCKTYPE);
		createEAttribute(blocktypeEClass, BLOCKTYPE__NAME);
		createEAttribute(blocktypeEClass, BLOCKTYPE__DESCRIPTION);
		createEAttribute(blocktypeEClass, BLOCKTYPE__CREATION_DATE);
		createEAttribute(blocktypeEClass, BLOCKTYPE__STYLE_REF);
		createEReference(blocktypeEClass, BLOCKTYPE__DOMAINS);

		titleMetaEClass = createEClass(TITLE_META);
		createEReference(titleMetaEClass, TITLE_META__LANGUAGE);
		createEAttribute(titleMetaEClass, TITLE_META__TITLE);

		courseMetaEClass = createEClass(COURSE_META);
		createEReference(courseMetaEClass, COURSE_META__DIDAC_META);
		createEAttribute(courseMetaEClass, COURSE_META__HOURS);
		createEAttribute(courseMetaEClass, COURSE_META__LVANR);
		createEAttribute(courseMetaEClass, COURSE_META__COLUMNFILTERASXML);
		createEAttribute(courseMetaEClass, COURSE_META__FROMEXT);
		createEAttribute(courseMetaEClass, COURSE_META__CREATION_DATE);
		createEReference(courseMetaEClass, COURSE_META__LECTURER);
		createEReference(courseMetaEClass, COURSE_META__DEF_LANG);

		simpleDidacMetaEClass = createEClass(SIMPLE_DIDAC_META);
		createEReference(simpleDidacMetaEClass, SIMPLE_DIDAC_META__LANGUAGE);
		createEAttribute(simpleDidacMetaEClass, SIMPLE_DIDAC_META__TITLE);
		createEAttribute(simpleDidacMetaEClass, SIMPLE_DIDAC_META__DESCRIPTION);
		createEAttribute(simpleDidacMetaEClass, SIMPLE_DIDAC_META__KEYWORDS);

		didacMetaEClass = createEClass(DIDAC_META);
		createEAttribute(didacMetaEClass, DIDAC_META__GOAL);
		createEReference(didacMetaEClass, DIDAC_META__PRECOGNITION);

		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__NAME);
		createEAttribute(domainEClass, DOMAIN__DESCRIPTION);
		createEReference(domainEClass, DOMAIN__BLOCKTYPES);
		createEAttribute(domainEClass, DOMAIN__CREATION_DATE);
		createEAttribute(domainEClass, DOMAIN__SERVER_URL);

		editionEClass = createEClass(EDITION);
		createEAttribute(editionEClass, EDITION__EDITION_NUMBER);
		createEAttribute(editionEClass, EDITION__EDITED_BY);
		createEAttribute(editionEClass, EDITION__IS_VERSION);
		createEAttribute(editionEClass, EDITION__LAST_VERSION_NUMBER);
		createEAttribute(editionEClass, EDITION__STATUS);
		createEAttribute(editionEClass, EDITION__EDITION_CREATION_DATE);

		folderMetaEClass = createEClass(FOLDER_META);
		createEAttribute(folderMetaEClass, FOLDER_META__TITLE);
		createEAttribute(folderMetaEClass, FOLDER_META__DESCRIPTION);
		createEAttribute(folderMetaEClass, FOLDER_META__CREATION_DATE);

		luMetaEClass = createEClass(LU_META);
		createEReference(luMetaEClass, LU_META__DIDAC_META);
		createEAttribute(luMetaEClass, LU_META__CREATION_DATE);
		createEReference(luMetaEClass, LU_META__DOMAIN);
		createEReference(luMetaEClass, LU_META__AUTHORS);
		createEReference(luMetaEClass, LU_META__PUBLISH_INFO);
		createEReference(luMetaEClass, LU_META__DEF_LANG);

		userauthorizationEClass = createEClass(USERAUTHORIZATION);
		createEReference(userauthorizationEClass, USERAUTHORIZATION__USER);
		createEReference(userauthorizationEClass, USERAUTHORIZATION__AUTH_TYPE);

		noteEClass = createEClass(NOTE);
		createEAttribute(noteEClass, NOTE__DATE);
		createEAttribute(noteEClass, NOTE__NOTE_AUTHOR);
		createEAttribute(noteEClass, NOTE__CONTENT);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__HONORIFIC);
		createEAttribute(personEClass, PERSON__FIRSTNAME);
		createEAttribute(personEClass, PERSON__SURNAME);
		createEAttribute(personEClass, PERSON__CONTRIB);
		createEReference(personEClass, PERSON__AFFILIATIONS);
		createEAttribute(personEClass, PERSON__PERSONBLURB);

		publisherEClass = createEClass(PUBLISHER);
		createEAttribute(publisherEClass, PUBLISHER__PUBLISHERNAME);
		createEReference(publisherEClass, PUBLISHER__ADDRESS);

		publishInfoEClass = createEClass(PUBLISH_INFO);
		createEAttribute(publishInfoEClass, PUBLISH_INFO__EDITION);
		createEAttribute(publishInfoEClass, PUBLISH_INFO__PUBDATE);
		createEReference(publishInfoEClass, PUBLISH_INFO__PUBLISHER);
		createEAttribute(publishInfoEClass, PUBLISH_INFO__PUBSNUMBER);
		createEAttribute(publishInfoEClass, PUBLISH_INFO__RELEASEINFO);

		resrcMetaEClass = createEClass(RESRC_META);
		createEAttribute(resrcMetaEClass, RESRC_META__FILENAME);
		createEAttribute(resrcMetaEClass, RESRC_META__PARAMETERS);
		createEAttribute(resrcMetaEClass, RESRC_META__HEIGHT);
		createEAttribute(resrcMetaEClass, RESRC_META__WIDTH);
		createEAttribute(resrcMetaEClass, RESRC_META__CREATION_DATE);
		createEAttribute(resrcMetaEClass, RESRC_META__LAST_MODIFIED);
		createEAttribute(resrcMetaEClass, RESRC_META__TITLE);
		createEAttribute(resrcMetaEClass, RESRC_META__DESCRIPTION);
		createEAttribute(resrcMetaEClass, RESRC_META__KEYWORDS);

		sharednotesEClass = createEClass(SHAREDNOTES);
		createEReference(sharednotesEClass, SHAREDNOTES__NOTES);

		coursetypeEClass = createEClass(COURSETYPE);
		createEReference(coursetypeEClass, COURSETYPE__LANGUAGE);
		createEAttribute(coursetypeEClass, COURSETYPE__TITLE);
		createEAttribute(coursetypeEClass, COURSETYPE__DESCRIPTION);

		externalMetadataEClass = createEClass(EXTERNAL_METADATA);
		createEAttribute(externalMetadataEClass, EXTERNAL_METADATA__REF);
		createEAttribute(externalMetadataEClass, EXTERNAL_METADATA__FILE);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__CODE);
		createEAttribute(languageEClass, LANGUAGE__VERSION);

		precognitionEClass = createEClass(PRECOGNITION);
		createEAttribute(precognitionEClass, PRECOGNITION__PRECOG);
		createEReference(precognitionEClass, PRECOGNITION__INTERNAL_REFS);

		internalRefEClass = createEClass(INTERNAL_REF);
		createEReference(internalRefEClass, INTERNAL_REF__LANGUAGE);
		createEAttribute(internalRefEClass, INTERNAL_REF__REF);
		createEAttribute(internalRefEClass, INTERNAL_REF__FILE);
		createEAttribute(internalRefEClass, INTERNAL_REF__REFTYPE);

		moduleMetaEClass = createEClass(MODULE_META);
		createEReference(moduleMetaEClass, MODULE_META__DIDAC_META);
		createEAttribute(moduleMetaEClass, MODULE_META__CREATION_DATE);
		createEReference(moduleMetaEClass, MODULE_META__AUTHORS);
		createEReference(moduleMetaEClass, MODULE_META__PUBLISH_INFO);
		createEReference(moduleMetaEClass, MODULE_META__DEF_LANG);

		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__AUTHOR);
		createEAttribute(sourceEClass, SOURCE__TITLE);
		createEAttribute(sourceEClass, SOURCE__SUBTITLE);
		createEAttribute(sourceEClass, SOURCE__PUBLISHED_IN);
		createEAttribute(sourceEClass, SOURCE__PUBLISHED_BY);
		createEAttribute(sourceEClass, SOURCE__DATE);
		createEAttribute(sourceEClass, SOURCE__PP);

		authorizationTypesEClass = createEClass(AUTHORIZATION_TYPES);
		createEAttribute(authorizationTypesEClass, AUTHORIZATION_TYPES__AUTH_TYPE);
		createEAttribute(authorizationTypesEClass, AUTHORIZATION_TYPES__AUTH_TYPE_DESC);
		createEAttribute(authorizationTypesEClass, AUTHORIZATION_TYPES__READ_ONLY);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__LOGINNAME);
		createEAttribute(userEClass, USER__PASSWORD);
		createEAttribute(userEClass, USER__FIRSTNAME);
		createEAttribute(userEClass, USER__LASTNAME);
		createEAttribute(userEClass, USER__MATRICULATIONNR);
		createEAttribute(userEClass, USER__SCN);
		createEAttribute(userEClass, USER__ICQNUMBER);
		createEAttribute(userEClass, USER__ICQPASSWORD);
		createEAttribute(userEClass, USER__ENTRYASXML);
		createEAttribute(userEClass, USER__LANGUAGENR);
		createEAttribute(userEClass, USER__NOTIFICATIONPROFILEASXML);
		createEAttribute(userEClass, USER__DOSSIERASXML);
		createEAttribute(userEClass, USER__PHOTO);
		createEAttribute(userEClass, USER__ONLINESTATUS);
		createEAttribute(userEClass, USER__ONLINEDATE);
		createEAttribute(userEClass, USER__DATAFILTER);
		createEAttribute(userEClass, USER__INCHATSINCE);
		createEAttribute(userEClass, USER__CONTCHATDATE);
		createEAttribute(userEClass, USER__CHATROOMNR);
		createEAttribute(userEClass, USER__FROMEXT);
		createEAttribute(userEClass, USER__LASTLOGINDATE);
		createEAttribute(userEClass, USER__CURRLOGINDATE);
		createEAttribute(userEClass, USER__LASTCOURSEMATERIALNR);
		createEAttribute(userEClass, USER__LASTCOURSEMATERIALVIEWNR);
		createEAttribute(userEClass, USER__AUTHENTICATELDAP);
		createEAttribute(userEClass, USER__PHOTOCHANGED);
		createEReference(userEClass, USER__AUTHORIZATIONS);
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

		// Add supertypes to classes
		blockEClass.getESuperTypes().add(this.getLearningObject());
		hypertextBlockEClass.getESuperTypes().add(this.getBlock());
		abstractContentEClass.getESuperTypes().add(this.getLearningObject());
		hypertextContentEClass.getESuperTypes().add(this.getAbstractContent());
		blockFolderEClass.getESuperTypes().add(this.getLearningObject());
		categoryEClass.getESuperTypes().add(this.getLearningObject());
		courseEClass.getESuperTypes().add(this.getLearningObject());
		learningUnitEClass.getESuperTypes().add(this.getLearningObject());
		luFolderEClass.getESuperTypes().add(this.getLearningObject());
		moduleEClass.getESuperTypes().add(this.getLearningObject());
		moduleFolderEClass.getESuperTypes().add(this.getLearningObject());
		resrcFolderEClass.getESuperTypes().add(this.getLearningObject());
		themeEClass.getESuperTypes().add(this.getLearningObject());
		themeNodeEClass.getESuperTypes().add(this.getNode());
		luNodeEClass.getESuperTypes().add(this.getNode());
		resrcFileEClass.getESuperTypes().add(this.getLearningObject());
		blockAudiofileEClass.getESuperTypes().add(this.getLearningObject());
		blockMetaEClass.getESuperTypes().add(this.getLearningObject());
		courseMetaEClass.getESuperTypes().add(this.getLearningObject());
		didacMetaEClass.getESuperTypes().add(this.getSimpleDidacMeta());
		folderMetaEClass.getESuperTypes().add(this.getLearningObject());
		luMetaEClass.getESuperTypes().add(this.getLearningObject());
		resrcMetaEClass.getESuperTypes().add(this.getLearningObject());
		moduleMetaEClass.getESuperTypes().add(this.getLearningObject());

		// Initialize classes and features; add operations and parameters
		initEClass(learningObjectEClass, LearningObject.class, "LearningObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLearningObject_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, LearningObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningObject_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 1, 1, LearningObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningObject_Synchronized(), ecorePackage.getEBoolean(), "synchronized", null, 1, 1, LearningObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_BlockMeta(), this.getBlockMeta(), null, "blockMeta", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_ExternalMetadata(), this.getExternalMetadata(), null, "externalMetadata", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBlock_Source(), this.getSource(), null, "source", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_AccessControl(), this.getAccessControl(), null, "accessControl", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypertextBlockEClass, HypertextBlock.class, "HypertextBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHypertextBlock_HypertextContent(), this.getHypertextContent(), null, "hypertextContent", null, 0, -1, HypertextBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractContentEClass, AbstractContent.class, "AbstractContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractContent_Heading(), ecorePackage.getEString(), "heading", null, 0, 1, AbstractContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractContent_Language(), this.getLanguage(), null, "language", null, 0, 1, AbstractContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hypertextContentEClass, HypertextContent.class, "HypertextContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHypertextContent_Content(), ecorePackage.getEString(), "content", null, 0, 1, HypertextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypertextContent_BlockAudiofile(), this.getblockAudiofile(), null, "blockAudiofile", null, 0, 1, HypertextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHypertextContent_ResrcFile(), this.getResrcFile(), this.getResrcFile_HypertextContent(), "resrcFile", null, 0, -1, HypertextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockFolderEClass, BlockFolder.class, "BlockFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockFolder_FolderMeta(), this.getFolderMeta(), null, "folderMeta", null, 1, 1, BlockFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockFolder_BlockFolder(), this.getBlockFolder(), null, "blockFolder", null, 0, -1, BlockFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockFolder_Block(), this.getBlock(), null, "block", null, 0, -1, BlockFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockFolder_AccessControl(), this.getAccessControl(), null, "accessControl", null, 0, 1, BlockFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategory_TitleMeta(), this.getTitleMeta(), null, "titleMeta", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Course(), this.getCourse(), null, "course", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(corrBlockEClass, CorrBlock.class, "CorrBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrBlock_PresentationBlock(), this.getPresentationBlock(), null, "presentationBlock", null, 0, -1, CorrBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrBlock_TitleMeta(), this.getTitleMeta(), null, "titleMeta", null, 0, -1, CorrBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourse_CourseMeta(), this.getCourseMeta(), null, "courseMeta", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_ExternalMetadata(), this.getExternalMetadata(), null, "externalMetadata", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCourse_Coursetype(), this.getCoursetype(), null, "coursetype", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_OutlineAsXml(), ecorePackage.getEString(), "outlineAsXml", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Module(), this.getModule(), null, "module", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItem_CorrBlock(), this.getCorrBlock(), null, "corrBlock", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Childitems(), this.getItem(), null, "childitems", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_LuRef(), ecorePackage.getEString(), "luRef", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(learningUnitEClass, LearningUnit.class, "LearningUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLearningUnit_LuMeta(), this.getLuMeta(), null, "luMeta", null, 1, 1, LearningUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningUnit_ExternalMetadata(), this.getExternalMetadata(), null, "externalMetadata", null, 0, -1, LearningUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLearningUnit_TreeAsXml(), ecorePackage.getEString(), "treeAsXml", null, 0, 1, LearningUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLearningUnit_LuFile(), ecorePackage.getEString(), "luFile", null, 0, 1, LearningUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningUnit_AccessControl(), this.getAccessControl(), null, "accessControl", null, 0, 1, LearningUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLearningUnit_Item(), this.getItem(), null, "item", null, 0, -1, LearningUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(luFolderEClass, LuFolder.class, "LuFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLuFolder_FolderMeta(), this.getFolderMeta(), null, "folderMeta", null, 1, 1, LuFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLuFolder_LuFolder(), this.getLuFolder(), null, "luFolder", null, 0, -1, LuFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLuFolder_LearningUnit(), this.getLearningUnit(), null, "learningUnit", null, 0, -1, LuFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLuFolder_AccessControl(), this.getAccessControl(), null, "accessControl", null, 0, 1, LuFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_ModuleMeta(), this.getModuleMeta(), null, "moduleMeta", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ExternalMetadata(), this.getExternalMetadata(), null, "externalMetadata", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModule_RootNode(), this.getNode(), null, "rootNode", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_ModuleFile(), ecorePackage.getEString(), "moduleFile", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_TreeAsXml(), ecorePackage.getEString(), "treeAsXml", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_AccessControl(), this.getAccessControl(), null, "accessControl", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleFolderEClass, ModuleFolder.class, "ModuleFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleFolder_FolderMeta(), this.getFolderMeta(), null, "folderMeta", null, 1, 1, ModuleFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleFolder_ModuleFolder(), this.getModuleFolder(), null, "moduleFolder", null, 0, -1, ModuleFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleFolder_Module(), this.getModule(), null, "module", null, 0, -1, ModuleFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleFolder_AccessControl(), this.getAccessControl(), null, "accessControl", null, 0, 1, ModuleFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resrcFolderEClass, ResrcFolder.class, "ResrcFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResrcFolder_FolderMeta(), this.getFolderMeta(), null, "folderMeta", null, 1, 1, ResrcFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResrcFolder_ResrcFolder(), this.getResrcFolder(), null, "resrcFolder", null, 0, -1, ResrcFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResrcFolder_AccessControl(), this.getAccessControl(), null, "accessControl", null, 0, 1, ResrcFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcFolder_DeleteScheduled(), ecorePackage.getEBoolean(), "deleteScheduled", null, 1, 1, ResrcFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResrcFolder_ResrcFile(), this.getResrcFile(), null, "resrcFile", null, 0, -1, ResrcFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(themeEClass, Theme.class, "Theme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTheme_SimpleDidacMeta(), this.getSimpleDidacMeta(), null, "simpleDidacMeta", null, 0, -1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationBlockEClass, PresentationBlock.class, "PresentationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresentationBlock_Lod(), ecorePackage.getEInt(), "lod", null, 1, 1, PresentationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentationBlock_Rendering(), ecorePackage.getEString(), "rendering", null, 1, 1, PresentationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationBlock_Block(), this.getBlock(), null, "block", null, 0, 1, PresentationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Visible(), ecorePackage.getEBoolean(), "visible", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(themeNodeEClass, ThemeNode.class, "ThemeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThemeNode_Theme(), this.getTheme(), null, "theme", null, 0, 1, ThemeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThemeNode_Childnodes(), this.getNode(), null, "childnodes", null, 0, -1, ThemeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(luNodeEClass, LuNode.class, "LuNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLuNode_LearningUnit(), this.getLearningUnit(), null, "learningUnit", null, 0, 1, LuNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resrcFileEClass, ResrcFile.class, "ResrcFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResrcFile_File(), theXMLTypePackage.getBase64Binary(), "file", null, 0, 1, ResrcFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcFile_File_tn(), theXMLTypePackage.getBase64Binary(), "file_tn", null, 0, 1, ResrcFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcFile_Originalextension(), ecorePackage.getEString(), "originalextension", null, 0, 1, ResrcFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcFile_Filesize(), ecorePackage.getEInt(), "filesize", null, 0, 1, ResrcFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcFile_ResrcHref(), ecorePackage.getEString(), "resrcHref", null, 0, 1, ResrcFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResrcFile_Accesscontrol(), this.getAccessControl(), null, "accesscontrol", null, 0, 1, ResrcFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResrcFile_ResrcFiletype(), this.getResrcFiletype(), null, "resrcFiletype", null, 0, 1, ResrcFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResrcFile_HypertextContent(), this.getHypertextContent(), this.getHypertextContent_ResrcFile(), "hypertextContent", null, 0, -1, ResrcFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockAudiofileEClass, blockAudiofile.class, "blockAudiofile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getblockAudiofile_File(), theXMLTypePackage.getBase64Binary(), "file", null, 0, 1, blockAudiofile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getblockAudiofile_Originalextension(), ecorePackage.getEString(), "originalextension", null, 0, 1, blockAudiofile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getblockAudiofile_Filesize(), ecorePackage.getEInt(), "filesize", null, 0, 1, blockAudiofile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getblockAudiofile_ResrcHref(), ecorePackage.getEString(), "resrcHref", null, 0, 1, blockAudiofile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getblockAudiofile_ResrcFiletype(), this.getResrcFiletype(), null, "resrcFiletype", null, 0, 1, blockAudiofile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resrcFiletypeEClass, ResrcFiletype.class, "ResrcFiletype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResrcFiletype_FiletypeExtension(), ecorePackage.getEString(), "filetypeExtension", null, 1, 1, ResrcFiletype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcFiletype_FiletypeDesc(), ecorePackage.getEString(), "filetypeDesc", null, 0, 1, ResrcFiletype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcFiletype_Image(), ecorePackage.getEBoolean(), "image", null, 1, 1, ResrcFiletype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcFiletype_Applet(), ecorePackage.getEBoolean(), "applet", null, 1, 1, ResrcFiletype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcFiletype_FiletypeImageSmall(), ecorePackage.getEString(), "filetypeImageSmall", null, 0, 1, ResrcFiletype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcFiletype_FiletypeImageBif(), ecorePackage.getEString(), "filetypeImageBif", null, 0, 1, ResrcFiletype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessControlEClass, AccessControl.class, "AccessControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessControl_Owner(), this.getUser(), null, "owner", null, 0, 1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControl_LastModified(), ecorePackage.getEDate(), "lastModified", null, 0, 1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControl_LastModifiedBy(), this.getUser(), null, "lastModifiedBy", null, 0, 1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControl_Status(), ecorePackage.getEString(), "status", null, 1, 1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControl_LastStatusChange(), ecorePackage.getEDate(), "lastStatusChange", null, 0, 1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControl_LastStatusChangeBy(), this.getUser(), null, "lastStatusChangeBy", null, 0, 1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControl_Sharednotes(), this.getSharednotes(), null, "sharednotes", null, 0, 1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControl_Authorizes(), this.getUserauthorization(), null, "authorizes", null, 0, -1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControl_EditionHistory(), this.getEdition(), null, "editionHistory", null, 0, -1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessControl_GlobalAccess(), ecorePackage.getEBoolean(), "globalAccess", null, 1, 1, AccessControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Street(), ecorePackage.getEString(), "street", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Postcode(), ecorePackage.getEString(), "postcode", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_City(), ecorePackage.getEString(), "city", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_State(), ecorePackage.getEString(), "state", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Country(), ecorePackage.getEString(), "country", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Phone(), ecorePackage.getEString(), "phone", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Fax(), ecorePackage.getEString(), "fax", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Email(), ecorePackage.getEString(), "email", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Otheraddr(), ecorePackage.getEString(), "otheraddr", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affiliationEClass, Affiliation.class, "Affiliation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAffiliation_Shortaffil(), ecorePackage.getEString(), "shortaffil", null, 0, 1, Affiliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliation_Jobtitle(), ecorePackage.getEString(), "jobtitle", null, 0, 1, Affiliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliation_Orgname(), ecorePackage.getEString(), "orgname", null, 0, 1, Affiliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffiliation_Orgdiv(), ecorePackage.getEString(), "orgdiv", null, 0, 1, Affiliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAffiliation_Address(), this.getAddress(), null, "address", null, 0, 1, Affiliation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_Credittype(), ecorePackage.getEString(), "credittype", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthor_Person(), this.getPerson(), null, "person", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthor_Address(), this.getAddress(), null, "address", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthor_Email(), ecorePackage.getEString(), "email", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockMetaEClass, BlockMeta.class, "BlockMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockMeta_Lod(), theXMLTypePackage.getInt(), "lod", null, 1, 1, BlockMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockMeta_Rendering(), ecorePackage.getEString(), "rendering", null, 1, 1, BlockMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockMeta_Blocktype(), this.getBlocktype(), null, "blocktype", null, 0, 1, BlockMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockMeta_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, BlockMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockMeta_LastModified(), ecorePackage.getEDate(), "lastModified", null, 0, 1, BlockMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockMeta_SimpleDidacMeta(), this.getSimpleDidacMeta(), null, "simpleDidacMeta", null, 0, -1, BlockMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockMeta_DefLang(), this.getLanguage(), null, "defLang", null, 0, 1, BlockMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blocktypeEClass, Blocktype.class, "Blocktype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlocktype_Name(), ecorePackage.getEString(), "name", null, 1, 1, Blocktype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlocktype_Description(), ecorePackage.getEString(), "description", null, 0, 1, Blocktype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlocktype_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, Blocktype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlocktype_StyleRef(), ecorePackage.getEString(), "styleRef", null, 0, 1, Blocktype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlocktype_Domains(), this.getDomain(), this.getDomain_Blocktypes(), "domains", null, 0, -1, Blocktype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titleMetaEClass, TitleMeta.class, "TitleMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTitleMeta_Language(), this.getLanguage(), null, "language", null, 0, 1, TitleMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitleMeta_Title(), ecorePackage.getEString(), "title", null, 0, 1, TitleMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseMetaEClass, CourseMeta.class, "CourseMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourseMeta_DidacMeta(), this.getDidacMeta(), null, "didacMeta", null, 0, -1, CourseMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseMeta_Hours(), ecorePackage.getEInt(), "hours", null, 0, 1, CourseMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseMeta_Lvanr(), ecorePackage.getEString(), "lvanr", null, 0, 1, CourseMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseMeta_Columnfilterasxml(), theXMLTypePackage.getString(), "columnfilterasxml", null, 0, 1, CourseMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseMeta_Fromext(), theXMLTypePackage.getInteger(), "fromext", null, 0, 1, CourseMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseMeta_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, CourseMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseMeta_Lecturer(), this.getUser(), null, "lecturer", null, 0, 1, CourseMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseMeta_DefLang(), this.getLanguage(), null, "defLang", null, 0, 1, CourseMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleDidacMetaEClass, SimpleDidacMeta.class, "SimpleDidacMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleDidacMeta_Language(), this.getLanguage(), null, "language", null, 0, 1, SimpleDidacMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDidacMeta_Title(), ecorePackage.getEString(), "title", null, 1, 1, SimpleDidacMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDidacMeta_Description(), ecorePackage.getEString(), "description", null, 0, 1, SimpleDidacMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDidacMeta_Keywords(), ecorePackage.getEString(), "keywords", null, 0, 1, SimpleDidacMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(didacMetaEClass, DidacMeta.class, "DidacMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDidacMeta_Goal(), ecorePackage.getEString(), "goal", null, 0, 1, DidacMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDidacMeta_Precognition(), this.getPrecognition(), null, "precognition", null, 0, 1, DidacMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Name(), ecorePackage.getEString(), "name", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_Description(), ecorePackage.getEString(), "description", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Blocktypes(), this.getBlocktype(), this.getBlocktype_Domains(), "blocktypes", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_ServerURL(), ecorePackage.getEString(), "serverURL", null, 1, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editionEClass, Edition.class, "Edition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdition_EditionNumber(), theXMLTypePackage.getID(), "editionNumber", null, 0, 1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdition_EditedBy(), ecorePackage.getEString(), "editedBy", null, 0, 1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdition_IsVersion(), theXMLTypePackage.getBoolean(), "isVersion", null, 0, 1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdition_LastVersionNumber(), ecorePackage.getEString(), "lastVersionNumber", null, 0, 1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdition_Status(), ecorePackage.getEString(), "status", null, 0, 1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdition_EditionCreationDate(), ecorePackage.getEDate(), "editionCreationDate", null, 0, 1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(folderMetaEClass, FolderMeta.class, "FolderMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFolderMeta_Title(), ecorePackage.getEString(), "title", null, 1, 1, FolderMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFolderMeta_Description(), ecorePackage.getEString(), "description", null, 0, 1, FolderMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFolderMeta_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, FolderMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(luMetaEClass, LuMeta.class, "LuMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLuMeta_DidacMeta(), this.getDidacMeta(), null, "didacMeta", null, 0, -1, LuMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuMeta_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, LuMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLuMeta_Domain(), this.getDomain(), null, "domain", null, 0, 1, LuMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLuMeta_Authors(), this.getAuthor(), null, "authors", null, 0, -1, LuMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLuMeta_PublishInfo(), this.getPublishInfo(), null, "publishInfo", null, 0, 1, LuMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLuMeta_DefLang(), this.getLanguage(), null, "defLang", null, 0, 1, LuMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userauthorizationEClass, Userauthorization.class, "Userauthorization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserauthorization_User(), this.getUser(), null, "user", null, 0, 1, Userauthorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserauthorization_AuthType(), this.getAuthorizationTypes(), null, "authType", null, 0, 1, Userauthorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNote_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_NoteAuthor(), ecorePackage.getEString(), "noteAuthor", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Content(), ecorePackage.getEString(), "content", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Honorific(), ecorePackage.getEString(), "honorific", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Firstname(), ecorePackage.getEString(), "firstname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Surname(), ecorePackage.getEString(), "surname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Contrib(), ecorePackage.getEString(), "contrib", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Affiliations(), this.getAffiliation(), null, "affiliations", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Personblurb(), ecorePackage.getEString(), "personblurb", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publisherEClass, Publisher.class, "Publisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublisher_Publishername(), ecorePackage.getEString(), "publishername", null, 1, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublisher_Address(), this.getAddress(), null, "address", null, 0, 1, Publisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publishInfoEClass, PublishInfo.class, "PublishInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublishInfo_Edition(), ecorePackage.getEString(), "edition", null, 1, 1, PublishInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublishInfo_Pubdate(), ecorePackage.getEDate(), "pubdate", null, 1, 1, PublishInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublishInfo_Publisher(), this.getPublisher(), null, "publisher", null, 0, 1, PublishInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublishInfo_Pubsnumber(), ecorePackage.getEString(), "pubsnumber", null, 0, 1, PublishInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublishInfo_Releaseinfo(), ecorePackage.getEString(), "releaseinfo", null, 0, 1, PublishInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resrcMetaEClass, ResrcMeta.class, "ResrcMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResrcMeta_Filename(), ecorePackage.getEString(), "filename", null, 1, 1, ResrcMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcMeta_Parameters(), ecorePackage.getEString(), "parameters", null, 0, 1, ResrcMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcMeta_Height(), ecorePackage.getEInt(), "height", null, 0, 1, ResrcMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcMeta_Width(), ecorePackage.getEInt(), "width", null, 0, 1, ResrcMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcMeta_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, ResrcMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcMeta_LastModified(), ecorePackage.getEDate(), "lastModified", null, 1, 1, ResrcMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcMeta_Title(), ecorePackage.getEString(), "title", null, 1, 1, ResrcMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcMeta_Description(), ecorePackage.getEString(), "description", null, 0, 1, ResrcMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResrcMeta_Keywords(), ecorePackage.getEString(), "keywords", null, 0, 1, ResrcMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharednotesEClass, Sharednotes.class, "Sharednotes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSharednotes_Notes(), this.getNote(), null, "notes", null, 0, -1, Sharednotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coursetypeEClass, Coursetype.class, "Coursetype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoursetype_Language(), this.getLanguage(), null, "language", null, 1, 1, Coursetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoursetype_Title(), ecorePackage.getEString(), "title", null, 1, 1, Coursetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoursetype_Description(), ecorePackage.getEString(), "description", null, 0, 1, Coursetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalMetadataEClass, ExternalMetadata.class, "ExternalMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalMetadata_Ref(), ecorePackage.getEString(), "ref", null, 1, 1, ExternalMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalMetadata_File(), ecorePackage.getEString(), "file", null, 0, 1, ExternalMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_Language(), ecorePackage.getEString(), "language", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Code(), theXMLTypePackage.getID(), "code", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Version(), theXMLTypePackage.getLong(), "version", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precognitionEClass, Precognition.class, "Precognition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrecognition_Precog(), ecorePackage.getEString(), "precog", null, 0, 1, Precognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrecognition_InternalRefs(), this.getInternalRef(), null, "internalRefs", null, 0, -1, Precognition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalRefEClass, InternalRef.class, "InternalRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalRef_Language(), this.getLanguage(), null, "language", null, 0, 1, InternalRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalRef_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, InternalRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalRef_File(), ecorePackage.getEString(), "file", null, 0, 1, InternalRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalRef_Reftype(), ecorePackage.getEString(), "reftype", null, 0, 1, InternalRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleMetaEClass, ModuleMeta.class, "ModuleMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleMeta_DidacMeta(), this.getDidacMeta(), null, "didacMeta", null, 0, -1, ModuleMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleMeta_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, ModuleMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleMeta_Authors(), this.getAuthor(), null, "authors", null, 0, -1, ModuleMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleMeta_PublishInfo(), this.getPublishInfo(), null, "publishInfo", null, 0, 1, ModuleMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleMeta_DefLang(), this.getLanguage(), null, "defLang", null, 0, 1, ModuleMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSource_Author(), this.getAuthor(), null, "author", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Title(), ecorePackage.getEString(), "title", null, 1, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Subtitle(), ecorePackage.getEString(), "subtitle", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_PublishedIn(), ecorePackage.getEString(), "publishedIn", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_PublishedBy(), ecorePackage.getEString(), "publishedBy", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Date(), theXMLTypePackage.getDate(), "date", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Pp(), ecorePackage.getEString(), "pp", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationTypesEClass, AuthorizationTypes.class, "AuthorizationTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizationTypes_AuthType(), ecorePackage.getEString(), "authType", null, 1, 1, AuthorizationTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizationTypes_AuthTypeDesc(), ecorePackage.getEString(), "authTypeDesc", null, 0, 1, AuthorizationTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizationTypes_ReadOnly(), ecorePackage.getEBoolean(), "readOnly", null, 1, 1, AuthorizationTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Loginname(), theXMLTypePackage.getString(), "loginname", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Firstname(), theXMLTypePackage.getString(), "firstname", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Lastname(), theXMLTypePackage.getString(), "lastname", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Matriculationnr(), theXMLTypePackage.getString(), "matriculationnr", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Scn(), theXMLTypePackage.getString(), "scn", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Icqnumber(), theXMLTypePackage.getString(), "icqnumber", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Icqpassword(), theXMLTypePackage.getString(), "icqpassword", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Entryasxml(), theXMLTypePackage.getString(), "entryasxml", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Languagenr(), theXMLTypePackage.getString(), "languagenr", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Notificationprofileasxml(), theXMLTypePackage.getString(), "notificationprofileasxml", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Dossierasxml(), theXMLTypePackage.getString(), "dossierasxml", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Photo(), theXMLTypePackage.getBase64Binary(), "photo", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Onlinestatus(), theXMLTypePackage.getString(), "onlinestatus", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Onlinedate(), ecorePackage.getEDate(), "onlinedate", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Datafilter(), theXMLTypePackage.getString(), "datafilter", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Inchatsince(), ecorePackage.getEDate(), "inchatsince", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Contchatdate(), ecorePackage.getEDate(), "contchatdate", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Chatroomnr(), theXMLTypePackage.getInteger(), "chatroomnr", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Fromext(), theXMLTypePackage.getInteger(), "fromext", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Lastlogindate(), ecorePackage.getEDate(), "lastlogindate", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Currlogindate(), ecorePackage.getEDate(), "currlogindate", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Lastcoursematerialnr(), theXMLTypePackage.getInteger(), "lastcoursematerialnr", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Lastcoursematerialviewnr(), theXMLTypePackage.getInteger(), "lastcoursematerialviewnr", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Authenticateldap(), theXMLTypePackage.getInteger(), "authenticateldap", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Photochanged(), theXMLTypePackage.getInteger(), "photochanged", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Authorizations(), this.getAuthorizationTypes(), null, "authorizations", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://annotation.elver.org/Indexed
		createIndexedAnnotations();
		// teneo.jpa
		createTeneoAnnotations();
		// http://annotation.elver.org/Table
		createTableAnnotations();
		// http://annotation.elver.org/Column
		createColumnAnnotations();
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
		  (learningObjectEClass, 
		   source, 
		   new String[] {
			 "name", "learningObject",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLearningObject_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getLearningObject_Timestamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "timestamp"
		   });		
		addAnnotation
		  (getLearningObject_Synchronized(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "synchronized"
		   });		
		addAnnotation
		  (blockEClass, 
		   source, 
		   new String[] {
			 "name", "block",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBlock_BlockMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blockMeta",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlock_ExternalMetadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "externalMetadata",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBlock_Source(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "source",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlock_AccessControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accessControl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (hypertextBlockEClass, 
		   source, 
		   new String[] {
			 "name", "hypertextBlock",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHypertextBlock_HypertextContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hypertextContent",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (abstractContentEClass, 
		   source, 
		   new String[] {
			 "name", "abstractContent",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractContent_Heading(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "heading"
		   });		
		addAnnotation
		  (getAbstractContent_Language(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (hypertextContentEClass, 
		   source, 
		   new String[] {
			 "name", "hypertextContent",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHypertextContent_Content(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "content"
		   });		
		addAnnotation
		  (getHypertextContent_BlockAudiofile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blockAudiofile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHypertextContent_ResrcFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resrcFile",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (blockFolderEClass, 
		   source, 
		   new String[] {
			 "name", "blockFolder",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBlockFolder_FolderMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "folderMeta",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlockFolder_BlockFolder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blockFolder",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBlockFolder_Block(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "block",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBlockFolder_AccessControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accessControl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (categoryEClass, 
		   source, 
		   new String[] {
			 "name", "category",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCategory_TitleMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "categoryDidacMeta",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCategory_Course(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "course",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (corrBlockEClass, 
		   source, 
		   new String[] {
			 "name", "corrBlock",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCorrBlock_PresentationBlock(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "presentationBlock",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCorrBlock_TitleMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "categoryDidacMeta",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (courseEClass, 
		   source, 
		   new String[] {
			 "name", "course",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCourse_CourseMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "courseMeta",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCourse_ExternalMetadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "externalMetadata",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCourse_Coursetype(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "coursetype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCourse_OutlineAsXml(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "outlineAsXml"
		   });		
		addAnnotation
		  (itemEClass, 
		   source, 
		   new String[] {
			 "name", "item",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getItem_CorrBlock(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "corrBlock",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getItem_Childitems(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "item",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (learningUnitEClass, 
		   source, 
		   new String[] {
			 "name", "learningUnit",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLearningUnit_LuMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "luMeta",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLearningUnit_ExternalMetadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "externalMetadata",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getLearningUnit_TreeAsXml(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "treeAsXml"
		   });		
		addAnnotation
		  (getLearningUnit_LuFile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "luFile"
		   });		
		addAnnotation
		  (getLearningUnit_AccessControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accessControl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (luFolderEClass, 
		   source, 
		   new String[] {
			 "name", "luFolder",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLuFolder_FolderMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "folderMeta",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLuFolder_LuFolder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "luFolder",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getLuFolder_LearningUnit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "learningUnit",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getLuFolder_AccessControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accessControl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (moduleEClass, 
		   source, 
		   new String[] {
			 "name", "module",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModule_ModuleMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "moduleMeta",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModule_ExternalMetadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "externalMetadata",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModule_RootNode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rootNode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModule_ModuleFile(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "moduleFile"
		   });		
		addAnnotation
		  (getModule_TreeAsXml(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "treeAsXml"
		   });		
		addAnnotation
		  (getModule_AccessControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accessControl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (moduleFolderEClass, 
		   source, 
		   new String[] {
			 "name", "moduleFolder",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModuleFolder_FolderMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "folderMeta",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModuleFolder_ModuleFolder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "moduleFolder",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModuleFolder_Module(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "module",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModuleFolder_AccessControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accessControl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (resrcFolderEClass, 
		   source, 
		   new String[] {
			 "name", "resrcFolder",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResrcFolder_FolderMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "folderMeta",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcFolder_ResrcFolder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resrcFolder",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getResrcFolder_AccessControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accessControl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcFolder_DeleteScheduled(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "deleteScheduled"
		   });		
		addAnnotation
		  (getResrcFolder_ResrcFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resrcFile",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (themeEClass, 
		   source, 
		   new String[] {
			 "name", "theme",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTheme_SimpleDidacMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleDidacMeta",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (presentationBlockEClass, 
		   source, 
		   new String[] {
			 "name", "presentationBlock",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPresentationBlock_Lod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPresentationBlock_Rendering(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rendering",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPresentationBlock_Block(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "block",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "name", "node",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNode_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible"
		   });		
		addAnnotation
		  (themeNodeEClass, 
		   source, 
		   new String[] {
			 "name", "themeNode",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getThemeNode_Childnodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "node",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (luNodeEClass, 
		   source, 
		   new String[] {
			 "name", "luNode",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLuNode_LearningUnit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "learningUnit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (resrcFileEClass, 
		   source, 
		   new String[] {
			 "name", "resrcFile",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResrcFile_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
		   });		
		addAnnotation
		  (getResrcFile_File_tn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file_tn"
		   });		
		addAnnotation
		  (getResrcFile_Originalextension(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "originalextension"
		   });		
		addAnnotation
		  (getResrcFile_Filesize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "filesize"
		   });		
		addAnnotation
		  (getResrcFile_ResrcHref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resrcHref"
		   });		
		addAnnotation
		  (getResrcFile_Accesscontrol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "accesscontrol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcFile_ResrcFiletype(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resrcFiletype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcFile_HypertextContent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hypetextContent",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (blockAudiofileEClass, 
		   source, 
		   new String[] {
			 "name", "blockAudiofile",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getblockAudiofile_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
		   });		
		addAnnotation
		  (getblockAudiofile_Originalextension(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "originalextension"
		   });		
		addAnnotation
		  (getblockAudiofile_Filesize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "filesize"
		   });		
		addAnnotation
		  (getblockAudiofile_ResrcHref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resrcHref"
		   });		
		addAnnotation
		  (getblockAudiofile_ResrcFiletype(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resrcFiletype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (resrcFiletypeEClass, 
		   source, 
		   new String[] {
			 "name", "resrcFiletype",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResrcFiletype_FiletypeExtension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "filetypeExtension",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcFiletype_FiletypeDesc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "filetypeDesc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcFiletype_Image(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "image",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcFiletype_Applet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "applet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcFiletype_FiletypeImageSmall(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "filetypeImageSmall",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcFiletype_FiletypeImageBif(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "filetypeImageBif",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (accessControlEClass, 
		   source, 
		   new String[] {
			 "name", "accessControl",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAccessControl_LastModified(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastModified",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAccessControl_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "status",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAccessControl_LastStatusChange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastStatusChange",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAccessControl_Sharednotes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sharednotes",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAccessControl_Authorizes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contributors",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getAccessControl_EditionHistory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "history",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getAccessControl_GlobalAccess(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "globalAccess",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (addressEClass, 
		   source, 
		   new String[] {
			 "name", "address",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddress_Street(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "street",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddress_Postcode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "postcode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddress_City(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "city",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddress_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddress_Country(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "country",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddress_Phone(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phone",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddress_Fax(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fax",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddress_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddress_Otheraddr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "otheraddr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (affiliationEClass, 
		   source, 
		   new String[] {
			 "name", "affiliation",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAffiliation_Shortaffil(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "shortaffil",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAffiliation_Jobtitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "jobtitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAffiliation_Orgname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "orgname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAffiliation_Orgdiv(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "orgdiv",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAffiliation_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (authorEClass, 
		   source, 
		   new String[] {
			 "name", "author",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuthor_Credittype(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "credittype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuthor_Person(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "person",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuthor_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuthor_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (blockMetaEClass, 
		   source, 
		   new String[] {
			 "name", "blockMeta",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBlockMeta_Lod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlockMeta_Rendering(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rendering",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlockMeta_Blocktype(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blocktype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlockMeta_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlockMeta_LastModified(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastModified",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlockMeta_SimpleDidacMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simpleDidacMeta",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getBlockMeta_DefLang(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defLang",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (blocktypeEClass, 
		   source, 
		   new String[] {
			 "name", "blocktype",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBlocktype_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlocktype_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlocktype_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBlocktype_StyleRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "styleRef"
		   });		
		addAnnotation
		  (getBlocktype_Domains(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "domains",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (titleMetaEClass, 
		   source, 
		   new String[] {
			 "name", "titleMeta",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTitleMeta_Language(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getTitleMeta_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (courseMetaEClass, 
		   source, 
		   new String[] {
			 "name", "courseMeta",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCourseMeta_DidacMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "didacMeta",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCourseMeta_Hours(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hours",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCourseMeta_Lvanr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lvanr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCourseMeta_Columnfilterasxml(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "columnfilterasxml",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCourseMeta_Fromext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fromext",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCourseMeta_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCourseMeta_Lecturer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lecturer",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCourseMeta_DefLang(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defLang",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (simpleDidacMetaEClass, 
		   source, 
		   new String[] {
			 "name", "simpleDidacMeta",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSimpleDidacMeta_Language(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getSimpleDidacMeta_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getSimpleDidacMeta_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description"
		   });		
		addAnnotation
		  (getSimpleDidacMeta_Keywords(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "keywords"
		   });		
		addAnnotation
		  (didacMetaEClass, 
		   source, 
		   new String[] {
			 "name", "didacMeta",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDidacMeta_Goal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "goal"
		   });		
		addAnnotation
		  (getDidacMeta_Precognition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "precognition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (domainEClass, 
		   source, 
		   new String[] {
			 "name", "domain",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDomain_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDomain_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDomain_Blocktypes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blocktype",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDomain_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDomain_ServerURL(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "serverURL"
		   });		
		addAnnotation
		  (editionEClass, 
		   source, 
		   new String[] {
			 "name", "edition",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEdition_EditionNumber(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "editionNumber"
		   });		
		addAnnotation
		  (getEdition_EditedBy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "editedBy"
		   });		
		addAnnotation
		  (getEdition_IsVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isVersion"
		   });		
		addAnnotation
		  (getEdition_LastVersionNumber(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lastVersionNumber"
		   });		
		addAnnotation
		  (getEdition_Status(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "status"
		   });		
		addAnnotation
		  (getEdition_EditionCreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "editionCreationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (folderMetaEClass, 
		   source, 
		   new String[] {
			 "name", "folderMeta",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFolderMeta_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFolderMeta_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFolderMeta_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (luMetaEClass, 
		   source, 
		   new String[] {
			 "name", "luMeta",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLuMeta_DidacMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "didacMeta",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getLuMeta_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLuMeta_Domain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "domain",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLuMeta_Authors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getLuMeta_PublishInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publishInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLuMeta_DefLang(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defLang",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (userauthorizationEClass, 
		   source, 
		   new String[] {
			 "name", "authorization",
			 "kind", "elementOnly"
		   });				
		addAnnotation
		  (noteEClass, 
		   source, 
		   new String[] {
			 "name", "note",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNote_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNote_NoteAuthor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "noteAuthor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNote_Content(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "content",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "name", "person",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPerson_Honorific(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "honorific",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPerson_Firstname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPerson_Surname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "surname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPerson_Contrib(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contrib",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPerson_Affiliations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "affiliation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getPerson_Personblurb(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "personblurb",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (publisherEClass, 
		   source, 
		   new String[] {
			 "name", "publisher",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPublisher_Publishername(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publishername",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPublisher_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (publishInfoEClass, 
		   source, 
		   new String[] {
			 "name", "publishInfo",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPublishInfo_Edition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "edition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPublishInfo_Pubdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pubdate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPublishInfo_Publisher(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publisher",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPublishInfo_Pubsnumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pubsnumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPublishInfo_Releaseinfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "releaseinfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (resrcMetaEClass, 
		   source, 
		   new String[] {
			 "name", "resrcMeta",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResrcMeta_Filename(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "filename",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcMeta_Parameters(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameters",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcMeta_Height(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "height",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcMeta_Width(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcMeta_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcMeta_LastModified(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastModified",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcMeta_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcMeta_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResrcMeta_Keywords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keywords",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sharednotesEClass, 
		   source, 
		   new String[] {
			 "name", "sharednotes",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSharednotes_Notes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "note",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (coursetypeEClass, 
		   source, 
		   new String[] {
			 "name", "coursetype",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCoursetype_Language(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getCoursetype_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getCoursetype_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description"
		   });		
		addAnnotation
		  (externalMetadataEClass, 
		   source, 
		   new String[] {
			 "name", "externalMetadata",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExternalMetadata_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (getExternalMetadata_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
		   });		
		addAnnotation
		  (languageEClass, 
		   source, 
		   new String[] {
			 "name", "language",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLanguage_Language(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "language"
		   });		
		addAnnotation
		  (getLanguage_Code(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "code"
		   });			
		addAnnotation
		  (precognitionEClass, 
		   source, 
		   new String[] {
			 "name", "precognition",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPrecognition_Precog(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "precog"
		   });		
		addAnnotation
		  (getPrecognition_InternalRefs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "luRef",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (internalRefEClass, 
		   source, 
		   new String[] {
			 "name", "internalRef",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInternalRef_Language(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "language",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getInternalRef_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref"
		   });		
		addAnnotation
		  (getInternalRef_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
		   });		
		addAnnotation
		  (moduleMetaEClass, 
		   source, 
		   new String[] {
			 "name", "ModuleMeta",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModuleMeta_DidacMeta(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "didacMeta",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModuleMeta_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "creationDate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModuleMeta_Authors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModuleMeta_PublishInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publishInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModuleMeta_DefLang(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "defLang",
			 "namespace", "##targetNamespace"
		   });				
		addAnnotation
		  (sourceEClass, 
		   source, 
		   new String[] {
			 "name", "source",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSource_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSource_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSource_Subtitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subtitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSource_PublishedIn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publishedIn",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSource_PublishedBy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publishedBy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSource_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSource_Pp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (authorizationTypesEClass, 
		   source, 
		   new String[] {
			 "name", "authorizationTypes",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuthorizationTypes_AuthType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "authType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuthorizationTypes_AuthTypeDesc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "authTypeDesc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuthorizationTypes_ReadOnly(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "readOnly",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (userEClass, 
		   source, 
		   new String[] {
			 "name", "user",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getUser_Loginname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "loginname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Password(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "password",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Firstname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Lastname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Matriculationnr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "matriculationnr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Scn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scn",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Icqnumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "icqnumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Icqpassword(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "icqpassword",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Entryasxml(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entryasxml",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Languagenr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "languagenr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Notificationprofileasxml(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "notificationprofileasxml",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Dossierasxml(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dossierasxml",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Photo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "photo",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getUser_Onlinestatus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "onlinestatus",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Onlinedate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "onlinedate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Datafilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "datafilter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Inchatsince(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inchatsince",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Contchatdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contchatdate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Chatroomnr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "chatroomnr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Fromext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fromext",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Lastlogindate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastlogindate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Currlogindate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "currlogindate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Lastcoursematerialnr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastcoursematerialnr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Lastcoursematerialviewnr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lastcoursematerialviewnr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Authenticateldap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "authenticateldap",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUser_Photochanged(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "photochanged",
			 "namespace", "##targetNamespace"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Indexed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIndexedAnnotations() {
		String source = "http://annotation.elver.org/Indexed";									
		addAnnotation
		  (getBlock_ExternalMetadata(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });						
		addAnnotation
		  (getHypertextBlock_HypertextContent(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });					
		addAnnotation
		  (getAbstractContent_Language(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });						
		addAnnotation
		  (getHypertextContent_ResrcFile(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });					
		addAnnotation
		  (getBlockFolder_BlockFolder(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });			
		addAnnotation
		  (getBlockFolder_Block(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });					
		addAnnotation
		  (getCategory_TitleMeta(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });					
		addAnnotation
		  (getCorrBlock_PresentationBlock(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });			
		addAnnotation
		  (getCorrBlock_TitleMeta(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });					
		addAnnotation
		  (getCourse_ExternalMetadata(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });						
		addAnnotation
		  (getItem_CorrBlock(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });						
		addAnnotation
		  (getLearningUnit_ExternalMetadata(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });								
		addAnnotation
		  (getLuFolder_LuFolder(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });			
		addAnnotation
		  (getLuFolder_LearningUnit(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });						
		addAnnotation
		  (getModule_ExternalMetadata(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });									
		addAnnotation
		  (getModuleFolder_ModuleFolder(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });			
		addAnnotation
		  (getModuleFolder_Module(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });						
		addAnnotation
		  (getResrcFolder_ResrcFolder(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });					
		addAnnotation
		  (getResrcFolder_ResrcFile(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });				
		addAnnotation
		  (getTheme_SimpleDidacMeta(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });						
		addAnnotation
		  (getPresentationBlock_Block(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });																	
		addAnnotation
		  (getResrcFile_HypertextContent(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });																					
		addAnnotation
		  (getAccessControl_Authorizes(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });			
		addAnnotation
		  (getAccessControl_EditionHistory(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });																															
		addAnnotation
		  (getBlockMeta_SimpleDidacMeta(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });			
		addAnnotation
		  (getBlockMeta_DefLang(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });								
		addAnnotation
		  (getBlocktype_Domains(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });				
		addAnnotation
		  (getTitleMeta_Language(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });					
		addAnnotation
		  (getCourseMeta_DidacMeta(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });									
		addAnnotation
		  (getCourseMeta_DefLang(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });				
		addAnnotation
		  (getSimpleDidacMeta_Language(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });												
		addAnnotation
		  (getDomain_Blocktypes(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });																	
		addAnnotation
		  (getLuMeta_DidacMeta(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });					
		addAnnotation
		  (getLuMeta_Authors(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });				
		addAnnotation
		  (getLuMeta_DefLang(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });			
		addAnnotation
		  (getUserauthorization_User(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });		
		addAnnotation
		  (getUserauthorization_AuthType(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });												
		addAnnotation
		  (getPerson_Affiliations(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });																								
		addAnnotation
		  (getSharednotes_Notes(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });				
		addAnnotation
		  (getCoursetype_Language(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });														
		addAnnotation
		  (getPrecognition_InternalRefs(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });				
		addAnnotation
		  (getInternalRef_Language(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });						
		addAnnotation
		  (getModuleMeta_DidacMeta(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });				
		addAnnotation
		  (getModuleMeta_Authors(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });				
		addAnnotation
		  (getModuleMeta_DefLang(), 
		   source, 
		   new String[] {
			 "value", "false"
		   });																																												
		addAnnotation
		  (getUser_Authorizations(), 
		   source, 
		   new String[] {
			 "value", "false"
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
		  (getLanguage_Version(), 
		   source, 
		   new String[] {
			 "appinfo", "@Version"
		   });																																																													
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Table</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createTableAnnotations() {
		String source = "http://annotation.elver.org/Table";																																																																																																																																																																																																																																																																																																			
		addAnnotation
		  (sourceEClass, 
		   source, 
		   new String[] {
			 "name", "blocksource"
		   });															
		addAnnotation
		  (userEClass, 
		   source, 
		   new String[] {
			 "name", "member"
		   });																												
	}

	/**
	 * Initializes the annotations for <b>http://annotation.elver.org/Column</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createColumnAnnotations() {
		String source = "http://annotation.elver.org/Column";																																																																																																																																																																																																																																																																																																																															
		addAnnotation
		  (getUser_Photo(), 
		   source, 
		   new String[] {
			 "length", "64000"
		   });														
	}

} //LobjPackageImpl

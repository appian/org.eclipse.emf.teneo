/**
 * <copyright>
 * </copyright>
 *
 * $Id: LobjAdapterFactory.java,v 1.1 2006/11/23 06:12:09 mtaal Exp $
 */
package lobj.util;

import lobj.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lobj.LobjPackage
 * @generated
 */
public class LobjAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LobjPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobjAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LobjPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LobjSwitch modelSwitch =
		new LobjSwitch() {
			public Object caseLearningObject(LearningObject object) {
				return createLearningObjectAdapter();
			}
			public Object caseBlock(Block object) {
				return createBlockAdapter();
			}
			public Object caseHypertextBlock(HypertextBlock object) {
				return createHypertextBlockAdapter();
			}
			public Object caseAbstractContent(AbstractContent object) {
				return createAbstractContentAdapter();
			}
			public Object caseHypertextContent(HypertextContent object) {
				return createHypertextContentAdapter();
			}
			public Object caseBlockFolder(BlockFolder object) {
				return createBlockFolderAdapter();
			}
			public Object caseCategory(Category object) {
				return createCategoryAdapter();
			}
			public Object caseCorrBlock(CorrBlock object) {
				return createCorrBlockAdapter();
			}
			public Object caseCourse(Course object) {
				return createCourseAdapter();
			}
			public Object caseItem(Item object) {
				return createItemAdapter();
			}
			public Object caseLearningUnit(LearningUnit object) {
				return createLearningUnitAdapter();
			}
			public Object caseLuFolder(LuFolder object) {
				return createLuFolderAdapter();
			}
			public Object caseModule(Module object) {
				return createModuleAdapter();
			}
			public Object caseModuleFolder(ModuleFolder object) {
				return createModuleFolderAdapter();
			}
			public Object caseResrcFolder(ResrcFolder object) {
				return createResrcFolderAdapter();
			}
			public Object caseTheme(Theme object) {
				return createThemeAdapter();
			}
			public Object casePresentationBlock(PresentationBlock object) {
				return createPresentationBlockAdapter();
			}
			public Object caseNode(Node object) {
				return createNodeAdapter();
			}
			public Object caseThemeNode(ThemeNode object) {
				return createThemeNodeAdapter();
			}
			public Object caseLuNode(LuNode object) {
				return createLuNodeAdapter();
			}
			public Object caseResrcFile(ResrcFile object) {
				return createResrcFileAdapter();
			}
			public Object caseblockAudiofile(blockAudiofile object) {
				return createblockAudiofileAdapter();
			}
			public Object caseResrcFiletype(ResrcFiletype object) {
				return createResrcFiletypeAdapter();
			}
			public Object caseAccessControl(AccessControl object) {
				return createAccessControlAdapter();
			}
			public Object caseAddress(Address object) {
				return createAddressAdapter();
			}
			public Object caseAffiliation(Affiliation object) {
				return createAffiliationAdapter();
			}
			public Object caseAuthor(Author object) {
				return createAuthorAdapter();
			}
			public Object caseBlockMeta(BlockMeta object) {
				return createBlockMetaAdapter();
			}
			public Object caseBlocktype(Blocktype object) {
				return createBlocktypeAdapter();
			}
			public Object caseTitleMeta(TitleMeta object) {
				return createTitleMetaAdapter();
			}
			public Object caseCourseMeta(CourseMeta object) {
				return createCourseMetaAdapter();
			}
			public Object caseSimpleDidacMeta(SimpleDidacMeta object) {
				return createSimpleDidacMetaAdapter();
			}
			public Object caseDidacMeta(DidacMeta object) {
				return createDidacMetaAdapter();
			}
			public Object caseDomain(Domain object) {
				return createDomainAdapter();
			}
			public Object caseEdition(Edition object) {
				return createEditionAdapter();
			}
			public Object caseFolderMeta(FolderMeta object) {
				return createFolderMetaAdapter();
			}
			public Object caseLuMeta(LuMeta object) {
				return createLuMetaAdapter();
			}
			public Object caseUserauthorization(Userauthorization object) {
				return createUserauthorizationAdapter();
			}
			public Object caseNote(Note object) {
				return createNoteAdapter();
			}
			public Object casePerson(Person object) {
				return createPersonAdapter();
			}
			public Object casePublisher(Publisher object) {
				return createPublisherAdapter();
			}
			public Object casePublishInfo(PublishInfo object) {
				return createPublishInfoAdapter();
			}
			public Object caseResrcMeta(ResrcMeta object) {
				return createResrcMetaAdapter();
			}
			public Object caseSharednotes(Sharednotes object) {
				return createSharednotesAdapter();
			}
			public Object caseCoursetype(Coursetype object) {
				return createCoursetypeAdapter();
			}
			public Object caseExternalMetadata(ExternalMetadata object) {
				return createExternalMetadataAdapter();
			}
			public Object caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			public Object casePrecognition(Precognition object) {
				return createPrecognitionAdapter();
			}
			public Object caseInternalRef(InternalRef object) {
				return createInternalRefAdapter();
			}
			public Object caseModuleMeta(ModuleMeta object) {
				return createModuleMetaAdapter();
			}
			public Object caseSource(Source object) {
				return createSourceAdapter();
			}
			public Object caseAuthorizationTypes(AuthorizationTypes object) {
				return createAuthorizationTypesAdapter();
			}
			public Object caseUser(User object) {
				return createUserAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link lobj.LearningObject <em>Learning Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.LearningObject
	 * @generated
	 */
	public Adapter createLearningObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.HypertextBlock <em>Hypertext Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.HypertextBlock
	 * @generated
	 */
	public Adapter createHypertextBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.AbstractContent <em>Abstract Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.AbstractContent
	 * @generated
	 */
	public Adapter createAbstractContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.HypertextContent <em>Hypertext Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.HypertextContent
	 * @generated
	 */
	public Adapter createHypertextContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.BlockFolder <em>Block Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.BlockFolder
	 * @generated
	 */
	public Adapter createBlockFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.CorrBlock <em>Corr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.CorrBlock
	 * @generated
	 */
	public Adapter createCorrBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.LearningUnit <em>Learning Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.LearningUnit
	 * @generated
	 */
	public Adapter createLearningUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.LuFolder <em>Lu Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.LuFolder
	 * @generated
	 */
	public Adapter createLuFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.ModuleFolder <em>Module Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.ModuleFolder
	 * @generated
	 */
	public Adapter createModuleFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.ResrcFolder <em>Resrc Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.ResrcFolder
	 * @generated
	 */
	public Adapter createResrcFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Theme
	 * @generated
	 */
	public Adapter createThemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.PresentationBlock <em>Presentation Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.PresentationBlock
	 * @generated
	 */
	public Adapter createPresentationBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.ThemeNode <em>Theme Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.ThemeNode
	 * @generated
	 */
	public Adapter createThemeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.LuNode <em>Lu Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.LuNode
	 * @generated
	 */
	public Adapter createLuNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.ResrcFile <em>Resrc File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.ResrcFile
	 * @generated
	 */
	public Adapter createResrcFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.blockAudiofile <em>block Audiofile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.blockAudiofile
	 * @generated
	 */
	public Adapter createblockAudiofileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.ResrcFiletype <em>Resrc Filetype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.ResrcFiletype
	 * @generated
	 */
	public Adapter createResrcFiletypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.AccessControl
	 * @generated
	 */
	public Adapter createAccessControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Affiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Affiliation
	 * @generated
	 */
	public Adapter createAffiliationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.BlockMeta <em>Block Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.BlockMeta
	 * @generated
	 */
	public Adapter createBlockMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Blocktype <em>Blocktype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Blocktype
	 * @generated
	 */
	public Adapter createBlocktypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.TitleMeta <em>Title Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.TitleMeta
	 * @generated
	 */
	public Adapter createTitleMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.CourseMeta <em>Course Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.CourseMeta
	 * @generated
	 */
	public Adapter createCourseMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.SimpleDidacMeta <em>Simple Didac Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.SimpleDidacMeta
	 * @generated
	 */
	public Adapter createSimpleDidacMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.DidacMeta <em>Didac Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.DidacMeta
	 * @generated
	 */
	public Adapter createDidacMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Edition
	 * @generated
	 */
	public Adapter createEditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.FolderMeta <em>Folder Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.FolderMeta
	 * @generated
	 */
	public Adapter createFolderMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.LuMeta <em>Lu Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.LuMeta
	 * @generated
	 */
	public Adapter createLuMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Userauthorization <em>Userauthorization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Userauthorization
	 * @generated
	 */
	public Adapter createUserauthorizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Publisher
	 * @generated
	 */
	public Adapter createPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.PublishInfo <em>Publish Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.PublishInfo
	 * @generated
	 */
	public Adapter createPublishInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.ResrcMeta <em>Resrc Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.ResrcMeta
	 * @generated
	 */
	public Adapter createResrcMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Sharednotes <em>Sharednotes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Sharednotes
	 * @generated
	 */
	public Adapter createSharednotesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Coursetype <em>Coursetype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Coursetype
	 * @generated
	 */
	public Adapter createCoursetypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.ExternalMetadata <em>External Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.ExternalMetadata
	 * @generated
	 */
	public Adapter createExternalMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Precognition <em>Precognition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Precognition
	 * @generated
	 */
	public Adapter createPrecognitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.InternalRef <em>Internal Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.InternalRef
	 * @generated
	 */
	public Adapter createInternalRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.ModuleMeta <em>Module Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.ModuleMeta
	 * @generated
	 */
	public Adapter createModuleMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.AuthorizationTypes <em>Authorization Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.AuthorizationTypes
	 * @generated
	 */
	public Adapter createAuthorizationTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lobj.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lobj.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LobjAdapterFactory

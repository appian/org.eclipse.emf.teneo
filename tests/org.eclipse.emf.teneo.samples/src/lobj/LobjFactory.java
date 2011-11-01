/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lobj.LobjPackage
 * @generated
 */
public interface LobjFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LobjFactory eINSTANCE = lobj.impl.LobjFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hypertext Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypertext Block</em>'.
	 * @generated
	 */
	HypertextBlock createHypertextBlock();

	/**
	 * Returns a new object of class '<em>Hypertext Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hypertext Content</em>'.
	 * @generated
	 */
	HypertextContent createHypertextContent();

	/**
	 * Returns a new object of class '<em>Block Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Folder</em>'.
	 * @generated
	 */
	BlockFolder createBlockFolder();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Corr Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Block</em>'.
	 * @generated
	 */
	CorrBlock createCorrBlock();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Learning Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Learning Unit</em>'.
	 * @generated
	 */
	LearningUnit createLearningUnit();

	/**
	 * Returns a new object of class '<em>Lu Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lu Folder</em>'.
	 * @generated
	 */
	LuFolder createLuFolder();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Module Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Folder</em>'.
	 * @generated
	 */
	ModuleFolder createModuleFolder();

	/**
	 * Returns a new object of class '<em>Resrc Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resrc Folder</em>'.
	 * @generated
	 */
	ResrcFolder createResrcFolder();

	/**
	 * Returns a new object of class '<em>Theme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Theme</em>'.
	 * @generated
	 */
	Theme createTheme();

	/**
	 * Returns a new object of class '<em>Presentation Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presentation Block</em>'.
	 * @generated
	 */
	PresentationBlock createPresentationBlock();

	/**
	 * Returns a new object of class '<em>Theme Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Theme Node</em>'.
	 * @generated
	 */
	ThemeNode createThemeNode();

	/**
	 * Returns a new object of class '<em>Lu Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lu Node</em>'.
	 * @generated
	 */
	LuNode createLuNode();

	/**
	 * Returns a new object of class '<em>Resrc File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resrc File</em>'.
	 * @generated
	 */
	ResrcFile createResrcFile();

	/**
	 * Returns a new object of class '<em>Block Audiofile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Audiofile</em>'.
	 * @generated
	 */
	BlockAudiofile createBlockAudiofile();

	/**
	 * Returns a new object of class '<em>Resrc Filetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resrc Filetype</em>'.
	 * @generated
	 */
	ResrcFiletype createResrcFiletype();

	/**
	 * Returns a new object of class '<em>Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control</em>'.
	 * @generated
	 */
	AccessControl createAccessControl();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Affiliation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affiliation</em>'.
	 * @generated
	 */
	Affiliation createAffiliation();

	/**
	 * Returns a new object of class '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author</em>'.
	 * @generated
	 */
	Author createAuthor();

	/**
	 * Returns a new object of class '<em>Block Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Meta</em>'.
	 * @generated
	 */
	BlockMeta createBlockMeta();

	/**
	 * Returns a new object of class '<em>Blocktype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blocktype</em>'.
	 * @generated
	 */
	Blocktype createBlocktype();

	/**
	 * Returns a new object of class '<em>Title Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title Meta</em>'.
	 * @generated
	 */
	TitleMeta createTitleMeta();

	/**
	 * Returns a new object of class '<em>Course Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Meta</em>'.
	 * @generated
	 */
	CourseMeta createCourseMeta();

	/**
	 * Returns a new object of class '<em>Simple Didac Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Didac Meta</em>'.
	 * @generated
	 */
	SimpleDidacMeta createSimpleDidacMeta();

	/**
	 * Returns a new object of class '<em>Didac Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Didac Meta</em>'.
	 * @generated
	 */
	DidacMeta createDidacMeta();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>Edition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edition</em>'.
	 * @generated
	 */
	Edition createEdition();

	/**
	 * Returns a new object of class '<em>Folder Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Meta</em>'.
	 * @generated
	 */
	FolderMeta createFolderMeta();

	/**
	 * Returns a new object of class '<em>Lu Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lu Meta</em>'.
	 * @generated
	 */
	LuMeta createLuMeta();

	/**
	 * Returns a new object of class '<em>Userauthorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Userauthorization</em>'.
	 * @generated
	 */
	Userauthorization createUserauthorization();

	/**
	 * Returns a new object of class '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note</em>'.
	 * @generated
	 */
	Note createNote();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publisher</em>'.
	 * @generated
	 */
	Publisher createPublisher();

	/**
	 * Returns a new object of class '<em>Publish Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publish Info</em>'.
	 * @generated
	 */
	PublishInfo createPublishInfo();

	/**
	 * Returns a new object of class '<em>Resrc Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resrc Meta</em>'.
	 * @generated
	 */
	ResrcMeta createResrcMeta();

	/**
	 * Returns a new object of class '<em>Sharednotes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sharednotes</em>'.
	 * @generated
	 */
	Sharednotes createSharednotes();

	/**
	 * Returns a new object of class '<em>Coursetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coursetype</em>'.
	 * @generated
	 */
	Coursetype createCoursetype();

	/**
	 * Returns a new object of class '<em>External Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Metadata</em>'.
	 * @generated
	 */
	ExternalMetadata createExternalMetadata();

	/**
	 * Returns a new object of class '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language</em>'.
	 * @generated
	 */
	Language createLanguage();

	/**
	 * Returns a new object of class '<em>Precognition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precognition</em>'.
	 * @generated
	 */
	Precognition createPrecognition();

	/**
	 * Returns a new object of class '<em>Internal Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Ref</em>'.
	 * @generated
	 */
	InternalRef createInternalRef();

	/**
	 * Returns a new object of class '<em>Module Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Meta</em>'.
	 * @generated
	 */
	ModuleMeta createModuleMeta();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	Source createSource();

	/**
	 * Returns a new object of class '<em>Authorization Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Types</em>'.
	 * @generated
	 */
	AuthorizationTypes createAuthorizationTypes();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LobjPackage getLobjPackage();

} //LobjFactory

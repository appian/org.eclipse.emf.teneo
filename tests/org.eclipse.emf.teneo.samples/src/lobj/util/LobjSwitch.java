/**
 * <copyright>
 * </copyright>
 *
 * $Id: LobjSwitch.java,v 1.3 2007/03/28 13:56:53 mtaal Exp $
 */
package lobj.util;

import java.util.List;

import lobj.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lobj.LobjPackage
 * @generated
 */
public class LobjSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LobjPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LobjSwitch() {
		if (modelPackage == null) {
			modelPackage = LobjPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LobjPackage.LEARNING_OBJECT: {
				LearningObject learningObject = (LearningObject)theEObject;
				Object result = caseLearningObject(learningObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.BLOCK: {
				Block block = (Block)theEObject;
				Object result = caseBlock(block);
				if (result == null) result = caseLearningObject(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.HYPERTEXT_BLOCK: {
				HypertextBlock hypertextBlock = (HypertextBlock)theEObject;
				Object result = caseHypertextBlock(hypertextBlock);
				if (result == null) result = caseBlock(hypertextBlock);
				if (result == null) result = caseLearningObject(hypertextBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.ABSTRACT_CONTENT: {
				AbstractContent abstractContent = (AbstractContent)theEObject;
				Object result = caseAbstractContent(abstractContent);
				if (result == null) result = caseLearningObject(abstractContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.HYPERTEXT_CONTENT: {
				HypertextContent hypertextContent = (HypertextContent)theEObject;
				Object result = caseHypertextContent(hypertextContent);
				if (result == null) result = caseAbstractContent(hypertextContent);
				if (result == null) result = caseLearningObject(hypertextContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.BLOCK_FOLDER: {
				BlockFolder blockFolder = (BlockFolder)theEObject;
				Object result = caseBlockFolder(blockFolder);
				if (result == null) result = caseLearningObject(blockFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.CATEGORY: {
				Category category = (Category)theEObject;
				Object result = caseCategory(category);
				if (result == null) result = caseLearningObject(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.CORR_BLOCK: {
				CorrBlock corrBlock = (CorrBlock)theEObject;
				Object result = caseCorrBlock(corrBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.COURSE: {
				Course course = (Course)theEObject;
				Object result = caseCourse(course);
				if (result == null) result = caseLearningObject(course);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.ITEM: {
				Item item = (Item)theEObject;
				Object result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.LEARNING_UNIT: {
				LearningUnit learningUnit = (LearningUnit)theEObject;
				Object result = caseLearningUnit(learningUnit);
				if (result == null) result = caseLearningObject(learningUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.LU_FOLDER: {
				LuFolder luFolder = (LuFolder)theEObject;
				Object result = caseLuFolder(luFolder);
				if (result == null) result = caseLearningObject(luFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.MODULE: {
				Module module = (Module)theEObject;
				Object result = caseModule(module);
				if (result == null) result = caseLearningObject(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.MODULE_FOLDER: {
				ModuleFolder moduleFolder = (ModuleFolder)theEObject;
				Object result = caseModuleFolder(moduleFolder);
				if (result == null) result = caseLearningObject(moduleFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.RESRC_FOLDER: {
				ResrcFolder resrcFolder = (ResrcFolder)theEObject;
				Object result = caseResrcFolder(resrcFolder);
				if (result == null) result = caseLearningObject(resrcFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.THEME: {
				Theme theme = (Theme)theEObject;
				Object result = caseTheme(theme);
				if (result == null) result = caseLearningObject(theme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.PRESENTATION_BLOCK: {
				PresentationBlock presentationBlock = (PresentationBlock)theEObject;
				Object result = casePresentationBlock(presentationBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.NODE: {
				Node node = (Node)theEObject;
				Object result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.THEME_NODE: {
				ThemeNode themeNode = (ThemeNode)theEObject;
				Object result = caseThemeNode(themeNode);
				if (result == null) result = caseNode(themeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.LU_NODE: {
				LuNode luNode = (LuNode)theEObject;
				Object result = caseLuNode(luNode);
				if (result == null) result = caseNode(luNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.RESRC_FILE: {
				ResrcFile resrcFile = (ResrcFile)theEObject;
				Object result = caseResrcFile(resrcFile);
				if (result == null) result = caseLearningObject(resrcFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.BLOCK_AUDIOFILE: {
				BlockAudiofile blockAudiofile = (BlockAudiofile)theEObject;
				Object result = caseBlockAudiofile(blockAudiofile);
				if (result == null) result = caseLearningObject(blockAudiofile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.RESRC_FILETYPE: {
				ResrcFiletype resrcFiletype = (ResrcFiletype)theEObject;
				Object result = caseResrcFiletype(resrcFiletype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.ACCESS_CONTROL: {
				AccessControl accessControl = (AccessControl)theEObject;
				Object result = caseAccessControl(accessControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.ADDRESS: {
				Address address = (Address)theEObject;
				Object result = caseAddress(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.AFFILIATION: {
				Affiliation affiliation = (Affiliation)theEObject;
				Object result = caseAffiliation(affiliation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.AUTHOR: {
				Author author = (Author)theEObject;
				Object result = caseAuthor(author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.BLOCK_META: {
				BlockMeta blockMeta = (BlockMeta)theEObject;
				Object result = caseBlockMeta(blockMeta);
				if (result == null) result = caseLearningObject(blockMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.BLOCKTYPE: {
				Blocktype blocktype = (Blocktype)theEObject;
				Object result = caseBlocktype(blocktype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.TITLE_META: {
				TitleMeta titleMeta = (TitleMeta)theEObject;
				Object result = caseTitleMeta(titleMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.COURSE_META: {
				CourseMeta courseMeta = (CourseMeta)theEObject;
				Object result = caseCourseMeta(courseMeta);
				if (result == null) result = caseLearningObject(courseMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.SIMPLE_DIDAC_META: {
				SimpleDidacMeta simpleDidacMeta = (SimpleDidacMeta)theEObject;
				Object result = caseSimpleDidacMeta(simpleDidacMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.DIDAC_META: {
				DidacMeta didacMeta = (DidacMeta)theEObject;
				Object result = caseDidacMeta(didacMeta);
				if (result == null) result = caseSimpleDidacMeta(didacMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				Object result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.EDITION: {
				Edition edition = (Edition)theEObject;
				Object result = caseEdition(edition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.FOLDER_META: {
				FolderMeta folderMeta = (FolderMeta)theEObject;
				Object result = caseFolderMeta(folderMeta);
				if (result == null) result = caseLearningObject(folderMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.LU_META: {
				LuMeta luMeta = (LuMeta)theEObject;
				Object result = caseLuMeta(luMeta);
				if (result == null) result = caseLearningObject(luMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.USERAUTHORIZATION: {
				Userauthorization userauthorization = (Userauthorization)theEObject;
				Object result = caseUserauthorization(userauthorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.NOTE: {
				Note note = (Note)theEObject;
				Object result = caseNote(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.PERSON: {
				Person person = (Person)theEObject;
				Object result = casePerson(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.PUBLISHER: {
				Publisher publisher = (Publisher)theEObject;
				Object result = casePublisher(publisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.PUBLISH_INFO: {
				PublishInfo publishInfo = (PublishInfo)theEObject;
				Object result = casePublishInfo(publishInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.RESRC_META: {
				ResrcMeta resrcMeta = (ResrcMeta)theEObject;
				Object result = caseResrcMeta(resrcMeta);
				if (result == null) result = caseLearningObject(resrcMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.SHAREDNOTES: {
				Sharednotes sharednotes = (Sharednotes)theEObject;
				Object result = caseSharednotes(sharednotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.COURSETYPE: {
				Coursetype coursetype = (Coursetype)theEObject;
				Object result = caseCoursetype(coursetype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.EXTERNAL_METADATA: {
				ExternalMetadata externalMetadata = (ExternalMetadata)theEObject;
				Object result = caseExternalMetadata(externalMetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.LANGUAGE: {
				Language language = (Language)theEObject;
				Object result = caseLanguage(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.PRECOGNITION: {
				Precognition precognition = (Precognition)theEObject;
				Object result = casePrecognition(precognition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.INTERNAL_REF: {
				InternalRef internalRef = (InternalRef)theEObject;
				Object result = caseInternalRef(internalRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.MODULE_META: {
				ModuleMeta moduleMeta = (ModuleMeta)theEObject;
				Object result = caseModuleMeta(moduleMeta);
				if (result == null) result = caseLearningObject(moduleMeta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.SOURCE: {
				Source source = (Source)theEObject;
				Object result = caseSource(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.AUTHORIZATION_TYPES: {
				AuthorizationTypes authorizationTypes = (AuthorizationTypes)theEObject;
				Object result = caseAuthorizationTypes(authorizationTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LobjPackage.USER: {
				User user = (User)theEObject;
				Object result = caseUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Learning Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Learning Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLearningObject(LearningObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Hypertext Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Hypertext Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHypertextBlock(HypertextBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Abstract Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Abstract Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractContent(AbstractContent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Hypertext Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Hypertext Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHypertextContent(HypertextContent object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Block Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Block Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBlockFolder(BlockFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Corr Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Corr Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCorrBlock(CorrBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Course</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCourse(Course object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Learning Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Learning Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLearningUnit(LearningUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Lu Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Lu Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLuFolder(LuFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Module Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Module Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModuleFolder(ModuleFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resrc Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resrc Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResrcFolder(ResrcFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Theme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Theme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTheme(Theme object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Presentation Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Presentation Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePresentationBlock(PresentationBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Theme Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Theme Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseThemeNode(ThemeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Lu Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Lu Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLuNode(LuNode object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resrc File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resrc File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResrcFile(ResrcFile object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Block Audiofile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Block Audiofile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBlockAudiofile(BlockAudiofile object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resrc Filetype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resrc Filetype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResrcFiletype(ResrcFiletype object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Access Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAccessControl(AccessControl object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Affiliation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Affiliation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAffiliation(Affiliation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAuthor(Author object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Block Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Block Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBlockMeta(BlockMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Blocktype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Blocktype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBlocktype(Blocktype object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Title Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Title Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTitleMeta(TitleMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Course Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Course Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCourseMeta(CourseMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Simple Didac Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Simple Didac Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimpleDidacMeta(SimpleDidacMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Didac Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Didac Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDidacMeta(DidacMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Edition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Edition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEdition(Edition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Folder Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Folder Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFolderMeta(FolderMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Lu Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Lu Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLuMeta(LuMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Userauthorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Userauthorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUserauthorization(Userauthorization object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePublisher(Publisher object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Publish Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Publish Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePublishInfo(PublishInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Resrc Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Resrc Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResrcMeta(ResrcMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Sharednotes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Sharednotes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSharednotes(Sharednotes object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Coursetype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Coursetype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCoursetype(Coursetype object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>External Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>External Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExternalMetadata(ExternalMetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Precognition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Precognition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrecognition(Precognition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Internal Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Internal Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInternalRef(InternalRef object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Module Meta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Module Meta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModuleMeta(ModuleMeta object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Authorization Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Authorization Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAuthorizationTypes(AuthorizationTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //LobjSwitch

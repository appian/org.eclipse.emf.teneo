/**
 * <copyright>
 * </copyright>
 *
 * $Id: LobjPackage.java,v 1.3 2007/03/28 13:56:48 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lobj.LobjFactory
 * @model kind="package"
 * @generated
 */
public interface LobjPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lobj";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "lobj.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lobj";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LobjPackage eINSTANCE = lobj.impl.LobjPackageImpl.init();

	/**
	 * The meta object id for the '{@link lobj.impl.LearningObjectImpl <em>Learning Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.LearningObjectImpl
	 * @see lobj.impl.LobjPackageImpl#getLearningObject()
	 * @generated
	 */
	int LEARNING_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECT__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECT__SYNCHRONIZED = 2;

	/**
	 * The number of structural features of the '<em>Learning Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lobj.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.BlockImpl
	 * @see lobj.impl.LobjPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Block Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCK_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__EXTERNAL_METADATA = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ACCESS_CONTROL = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lobj.impl.HypertextBlockImpl <em>Hypertext Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.HypertextBlockImpl
	 * @see lobj.impl.LobjPackageImpl#getHypertextBlock()
	 * @generated
	 */
	int HYPERTEXT_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_BLOCK__ID = BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_BLOCK__TIMESTAMP = BLOCK__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_BLOCK__SYNCHRONIZED = BLOCK__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Block Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_BLOCK__BLOCK_META = BLOCK__BLOCK_META;

	/**
	 * The feature id for the '<em><b>External Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_BLOCK__EXTERNAL_METADATA = BLOCK__EXTERNAL_METADATA;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_BLOCK__ACCESS_CONTROL = BLOCK__ACCESS_CONTROL;

	/**
	 * The feature id for the '<em><b>Hypertext Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_BLOCK__HYPERTEXT_CONTENT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hypertext Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lobj.impl.AbstractContentImpl <em>Abstract Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.AbstractContentImpl
	 * @see lobj.impl.LobjPackageImpl#getAbstractContent()
	 * @generated
	 */
	int ABSTRACT_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__HEADING = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__LANGUAGE = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT__SOURCE = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lobj.impl.HypertextContentImpl <em>Hypertext Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.HypertextContentImpl
	 * @see lobj.impl.LobjPackageImpl#getHypertextContent()
	 * @generated
	 */
	int HYPERTEXT_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_CONTENT__ID = ABSTRACT_CONTENT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_CONTENT__TIMESTAMP = ABSTRACT_CONTENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_CONTENT__SYNCHRONIZED = ABSTRACT_CONTENT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_CONTENT__HEADING = ABSTRACT_CONTENT__HEADING;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_CONTENT__LANGUAGE = ABSTRACT_CONTENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_CONTENT__SOURCE = ABSTRACT_CONTENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_CONTENT__CONTENT = ABSTRACT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block Audiofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_CONTENT__BLOCK_AUDIOFILE = ABSTRACT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resrc File</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_CONTENT__RESRC_FILE = ABSTRACT_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hypertext Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPERTEXT_CONTENT_FEATURE_COUNT = ABSTRACT_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lobj.impl.BlockFolderImpl <em>Block Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.BlockFolderImpl
	 * @see lobj.impl.LobjPackageImpl#getBlockFolder()
	 * @generated
	 */
	int BLOCK_FOLDER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FOLDER__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FOLDER__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FOLDER__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Folder Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FOLDER__FOLDER_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FOLDER__BLOCK_FOLDER = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FOLDER__BLOCK = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FOLDER__ACCESS_CONTROL = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Block Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FOLDER_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lobj.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.CategoryImpl
	 * @see lobj.impl.LobjPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Title Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TITLE_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__COURSE = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lobj.impl.CorrBlockImpl <em>Corr Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.CorrBlockImpl
	 * @see lobj.impl.LobjPackageImpl#getCorrBlock()
	 * @generated
	 */
	int CORR_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Presentation Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK__PRESENTATION_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Title Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK__TITLE_META = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK__ID = 2;

	/**
	 * The number of structural features of the '<em>Corr Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_BLOCK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lobj.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.CourseImpl
	 * @see lobj.impl.LobjPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Course Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__EXTERNAL_METADATA = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coursetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSETYPE = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outline As Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__OUTLINE_AS_XML = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__MODULE = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link lobj.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ItemImpl
	 * @see lobj.impl.LobjPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 9;

	/**
	 * The feature id for the '<em><b>Corr Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CORR_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Childitems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CHILDITEMS = 1;

	/**
	 * The feature id for the '<em><b>Lu Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LU_REF = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lobj.impl.LearningUnitImpl <em>Learning Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.LearningUnitImpl
	 * @see lobj.impl.LobjPackageImpl#getLearningUnit()
	 * @generated
	 */
	int LEARNING_UNIT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_UNIT__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_UNIT__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_UNIT__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Lu Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_UNIT__LU_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_UNIT__EXTERNAL_METADATA = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tree As Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_UNIT__TREE_AS_XML = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lu File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_UNIT__LU_FILE = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_UNIT__ACCESS_CONTROL = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_UNIT__ITEM = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Learning Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_UNIT_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link lobj.impl.LuFolderImpl <em>Lu Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.LuFolderImpl
	 * @see lobj.impl.LobjPackageImpl#getLuFolder()
	 * @generated
	 */
	int LU_FOLDER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_FOLDER__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_FOLDER__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_FOLDER__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Folder Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_FOLDER__FOLDER_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lu Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_FOLDER__LU_FOLDER = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Learning Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_FOLDER__LEARNING_UNIT = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_FOLDER__ACCESS_CONTROL = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Lu Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_FOLDER_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lobj.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ModuleImpl
	 * @see lobj.impl.LobjPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Module Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EXTERNAL_METADATA = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ROOT_NODE = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULE_FILE = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tree As Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TREE_AS_XML = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ACCESS_CONTROL = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link lobj.impl.ModuleFolderImpl <em>Module Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ModuleFolderImpl
	 * @see lobj.impl.LobjPackageImpl#getModuleFolder()
	 * @generated
	 */
	int MODULE_FOLDER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FOLDER__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FOLDER__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FOLDER__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Folder Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FOLDER__FOLDER_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FOLDER__MODULE_FOLDER = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FOLDER__MODULE = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FOLDER__ACCESS_CONTROL = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FOLDER_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lobj.impl.ResrcFolderImpl <em>Resrc Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ResrcFolderImpl
	 * @see lobj.impl.LobjPackageImpl#getResrcFolder()
	 * @generated
	 */
	int RESRC_FOLDER = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FOLDER__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FOLDER__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FOLDER__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Folder Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FOLDER__FOLDER_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resrc Folder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FOLDER__RESRC_FOLDER = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FOLDER__ACCESS_CONTROL = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Delete Scheduled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FOLDER__DELETE_SCHEDULED = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resrc File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FOLDER__RESRC_FILE = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resrc Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FOLDER_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link lobj.impl.ThemeImpl <em>Theme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ThemeImpl
	 * @see lobj.impl.LobjPackageImpl#getTheme()
	 * @generated
	 */
	int THEME = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Simple Didac Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__SIMPLE_DIDAC_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Theme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lobj.impl.PresentationBlockImpl <em>Presentation Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.PresentationBlockImpl
	 * @see lobj.impl.LobjPackageImpl#getPresentationBlock()
	 * @generated
	 */
	int PRESENTATION_BLOCK = 16;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_BLOCK__LOD = 0;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_BLOCK__RENDERING = 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_BLOCK__BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_BLOCK__ID = 3;

	/**
	 * The number of structural features of the '<em>Presentation Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lobj.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.Node
	 * @see lobj.impl.LobjPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 17;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VISIBLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lobj.impl.ThemeNodeImpl <em>Theme Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ThemeNodeImpl
	 * @see lobj.impl.LobjPackageImpl#getThemeNode()
	 * @generated
	 */
	int THEME_NODE = 18;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_NODE__VISIBLE = NODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_NODE__THEME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Childnodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_NODE__CHILDNODES = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Theme Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lobj.impl.LuNodeImpl <em>Lu Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.LuNodeImpl
	 * @see lobj.impl.LobjPackageImpl#getLuNode()
	 * @generated
	 */
	int LU_NODE = 19;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_NODE__VISIBLE = NODE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_NODE__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Learning Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_NODE__LEARNING_UNIT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lu Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lobj.impl.ResrcFileImpl <em>Resrc File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ResrcFileImpl
	 * @see lobj.impl.LobjPackageImpl#getResrcFile()
	 * @generated
	 */
	int RESRC_FILE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__FILE = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File tn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__FILE_TN = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Originalextension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__ORIGINALEXTENSION = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filesize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__FILESIZE = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resrc Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__RESRC_HREF = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Accesscontrol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__ACCESSCONTROL = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resrc Filetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__RESRC_FILETYPE = LEARNING_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__SOURCE = LEARNING_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Hypertext Content</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__HYPERTEXT_CONTENT = LEARNING_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resrc Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE__RESRC_META = LEARNING_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Resrc File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILE_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link lobj.impl.BlockAudiofileImpl <em>Block Audiofile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.BlockAudiofileImpl
	 * @see lobj.impl.LobjPackageImpl#getBlockAudiofile()
	 * @generated
	 */
	int BLOCK_AUDIOFILE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_AUDIOFILE__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_AUDIOFILE__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_AUDIOFILE__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_AUDIOFILE__FILE = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Originalextension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_AUDIOFILE__ORIGINALEXTENSION = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filesize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_AUDIOFILE__FILESIZE = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resrc Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_AUDIOFILE__RESRC_HREF = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resrc Filetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_AUDIOFILE__RESRC_FILETYPE = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Block Audiofile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_AUDIOFILE_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link lobj.impl.ResrcFiletypeImpl <em>Resrc Filetype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ResrcFiletypeImpl
	 * @see lobj.impl.LobjPackageImpl#getResrcFiletype()
	 * @generated
	 */
	int RESRC_FILETYPE = 22;

	/**
	 * The feature id for the '<em><b>Filetype Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILETYPE__FILETYPE_EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Filetype Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILETYPE__FILETYPE_DESC = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILETYPE__IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Applet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILETYPE__APPLET = 3;

	/**
	 * The feature id for the '<em><b>Filetype Image Small</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILETYPE__FILETYPE_IMAGE_SMALL = 4;

	/**
	 * The feature id for the '<em><b>Filetype Image Bif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILETYPE__FILETYPE_IMAGE_BIF = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILETYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Resrc Filetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_FILETYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link lobj.impl.AccessControlImpl <em>Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.AccessControlImpl
	 * @see lobj.impl.LobjPackageImpl#getAccessControl()
	 * @generated
	 */
	int ACCESS_CONTROL = 23;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__LAST_MODIFIED = 1;

	/**
	 * The feature id for the '<em><b>Last Modified By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__LAST_MODIFIED_BY = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Last Status Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__LAST_STATUS_CHANGE = 4;

	/**
	 * The feature id for the '<em><b>Last Status Change By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__LAST_STATUS_CHANGE_BY = 5;

	/**
	 * The feature id for the '<em><b>Sharednotes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__SHAREDNOTES = 6;

	/**
	 * The feature id for the '<em><b>Authorizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__AUTHORIZES = 7;

	/**
	 * The feature id for the '<em><b>Edition History</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__EDITION_HISTORY = 8;

	/**
	 * The feature id for the '<em><b>Global Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__GLOBAL_ACCESS = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL__ID = 10;

	/**
	 * The number of structural features of the '<em>Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link lobj.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.AddressImpl
	 * @see lobj.impl.LobjPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 24;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 0;

	/**
	 * The feature id for the '<em><b>Postcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__POSTCODE = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STATE = 3;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 4;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__PHONE = 5;

	/**
	 * The feature id for the '<em><b>Fax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__FAX = 6;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__EMAIL = 7;

	/**
	 * The feature id for the '<em><b>Otheraddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__OTHERADDR = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID = 9;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link lobj.impl.AffiliationImpl <em>Affiliation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.AffiliationImpl
	 * @see lobj.impl.LobjPackageImpl#getAffiliation()
	 * @generated
	 */
	int AFFILIATION = 25;

	/**
	 * The feature id for the '<em><b>Shortaffil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__SHORTAFFIL = 0;

	/**
	 * The feature id for the '<em><b>Jobtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__JOBTITLE = 1;

	/**
	 * The feature id for the '<em><b>Orgname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__ORGNAME = 2;

	/**
	 * The feature id for the '<em><b>Orgdiv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__ORGDIV = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION__ID = 5;

	/**
	 * The number of structural features of the '<em>Affiliation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link lobj.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.AuthorImpl
	 * @see lobj.impl.LobjPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 26;

	/**
	 * The feature id for the '<em><b>Credittype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__CREDITTYPE = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ID = 4;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link lobj.impl.BlockMetaImpl <em>Block Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.BlockMetaImpl
	 * @see lobj.impl.LobjPackageImpl#getBlockMeta()
	 * @generated
	 */
	int BLOCK_META = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META__LOD = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META__RENDERING = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META__BLOCKTYPE = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META__CREATION_DATE = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META__LAST_MODIFIED = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Simple Didac Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META__SIMPLE_DIDAC_META = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Def Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META__DEF_LANG = LEARNING_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Block Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_META_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link lobj.impl.BlocktypeImpl <em>Blocktype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.BlocktypeImpl
	 * @see lobj.impl.LobjPackageImpl#getBlocktype()
	 * @generated
	 */
	int BLOCKTYPE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKTYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKTYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKTYPE__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Style Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKTYPE__STYLE_REF = 3;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKTYPE__DOMAINS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKTYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Blocktype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKTYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link lobj.impl.TitleMetaImpl <em>Title Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.TitleMetaImpl
	 * @see lobj.impl.LobjPackageImpl#getTitleMeta()
	 * @generated
	 */
	int TITLE_META = 29;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_META__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_META__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_META__ID = 2;

	/**
	 * The number of structural features of the '<em>Title Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_META_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lobj.impl.CourseMetaImpl <em>Course Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.CourseMetaImpl
	 * @see lobj.impl.LobjPackageImpl#getCourseMeta()
	 * @generated
	 */
	int COURSE_META = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Didac Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__DIDAC_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__HOURS = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lvanr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__LVANR = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columnfilterasxml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__COLUMNFILTERASXML = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fromext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__FROMEXT = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__CREATION_DATE = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lecturer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__LECTURER = LEARNING_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Def Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META__DEF_LANG = LEARNING_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Course Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_META_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link lobj.impl.SimpleDidacMetaImpl <em>Simple Didac Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.SimpleDidacMetaImpl
	 * @see lobj.impl.LobjPackageImpl#getSimpleDidacMeta()
	 * @generated
	 */
	int SIMPLE_DIDAC_META = 31;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIDAC_META__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIDAC_META__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIDAC_META__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIDAC_META__KEYWORDS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIDAC_META__ID = 4;

	/**
	 * The number of structural features of the '<em>Simple Didac Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DIDAC_META_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link lobj.impl.DidacMetaImpl <em>Didac Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.DidacMetaImpl
	 * @see lobj.impl.LobjPackageImpl#getDidacMeta()
	 * @generated
	 */
	int DIDAC_META = 32;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDAC_META__LANGUAGE = SIMPLE_DIDAC_META__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDAC_META__TITLE = SIMPLE_DIDAC_META__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDAC_META__DESCRIPTION = SIMPLE_DIDAC_META__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDAC_META__KEYWORDS = SIMPLE_DIDAC_META__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDAC_META__ID = SIMPLE_DIDAC_META__ID;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDAC_META__GOAL = SIMPLE_DIDAC_META_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Precognition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDAC_META__PRECOGNITION = SIMPLE_DIDAC_META_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Didac Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIDAC_META_FEATURE_COUNT = SIMPLE_DIDAC_META_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lobj.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.DomainImpl
	 * @see lobj.impl.LobjPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Blocktypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__BLOCKTYPES = 2;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CREATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SERVER_URL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ID = 5;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link lobj.impl.EditionImpl <em>Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.EditionImpl
	 * @see lobj.impl.LobjPackageImpl#getEdition()
	 * @generated
	 */
	int EDITION = 34;

	/**
	 * The feature id for the '<em><b>Edition Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__EDITION_NR = 0;

	/**
	 * The feature id for the '<em><b>Edited By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__EDITED_BY = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Last Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__LAST_VERSION_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Edition Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__EDITION_CREATION_DATE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__ID = 6;

	/**
	 * The number of structural features of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link lobj.impl.FolderMetaImpl <em>Folder Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.FolderMetaImpl
	 * @see lobj.impl.LobjPackageImpl#getFolderMeta()
	 * @generated
	 */
	int FOLDER_META = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_META__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_META__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_META__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_META__TITLE = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_META__DESCRIPTION = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_META__CREATION_DATE = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Folder Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_META_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lobj.impl.LuMetaImpl <em>Lu Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.LuMetaImpl
	 * @see lobj.impl.LobjPackageImpl#getLuMeta()
	 * @generated
	 */
	int LU_META = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_META__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_META__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_META__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Didac Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_META__DIDAC_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_META__CREATION_DATE = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_META__DOMAIN = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_META__AUTHORS = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Publish Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_META__PUBLISH_INFO = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Def Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_META__DEF_LANG = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Lu Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LU_META_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link lobj.impl.UserauthorizationImpl <em>Userauthorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.UserauthorizationImpl
	 * @see lobj.impl.LobjPackageImpl#getUserauthorization()
	 * @generated
	 */
	int USERAUTHORIZATION = 37;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERAUTHORIZATION__USER = 0;

	/**
	 * The feature id for the '<em><b>Auth Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERAUTHORIZATION__AUTH_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERAUTHORIZATION__ID = 2;

	/**
	 * The number of structural features of the '<em>Userauthorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERAUTHORIZATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lobj.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.NoteImpl
	 * @see lobj.impl.LobjPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 38;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Note Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NOTE_AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ID = 3;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lobj.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.PersonImpl
	 * @see lobj.impl.LobjPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 39;

	/**
	 * The feature id for the '<em><b>Honorific</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HONORIFIC = 0;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRSTNAME = 1;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SURNAME = 2;

	/**
	 * The feature id for the '<em><b>Contrib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTRIB = 3;

	/**
	 * The feature id for the '<em><b>Affiliations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AFFILIATIONS = 4;

	/**
	 * The feature id for the '<em><b>Personblurb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSONBLURB = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = 6;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link lobj.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.PublisherImpl
	 * @see lobj.impl.LobjPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 40;

	/**
	 * The feature id for the '<em><b>Publishername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__PUBLISHERNAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__ID = 2;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lobj.impl.PublishInfoImpl <em>Publish Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.PublishInfoImpl
	 * @see lobj.impl.LobjPackageImpl#getPublishInfo()
	 * @generated
	 */
	int PUBLISH_INFO = 41;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_INFO__EDITION = 0;

	/**
	 * The feature id for the '<em><b>Pubdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_INFO__PUBDATE = 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_INFO__PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Pubsnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_INFO__PUBSNUMBER = 3;

	/**
	 * The feature id for the '<em><b>Releaseinfo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_INFO__RELEASEINFO = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_INFO__ID = 5;

	/**
	 * The number of structural features of the '<em>Publish Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISH_INFO_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link lobj.impl.ResrcMetaImpl <em>Resrc Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ResrcMetaImpl
	 * @see lobj.impl.LobjPackageImpl#getResrcMeta()
	 * @generated
	 */
	int RESRC_META = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__FILENAME = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__PARAMETERS = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__HEIGHT = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__WIDTH = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__CREATION_DATE = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__LAST_MODIFIED = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__TITLE = LEARNING_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__DESCRIPTION = LEARNING_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META__KEYWORDS = LEARNING_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Resrc Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESRC_META_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link lobj.impl.SharednotesImpl <em>Sharednotes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.SharednotesImpl
	 * @see lobj.impl.LobjPackageImpl#getSharednotes()
	 * @generated
	 */
	int SHAREDNOTES = 43;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREDNOTES__NOTES = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREDNOTES__ID = 1;

	/**
	 * The number of structural features of the '<em>Sharednotes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAREDNOTES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lobj.impl.CoursetypeImpl <em>Coursetype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.CoursetypeImpl
	 * @see lobj.impl.LobjPackageImpl#getCoursetype()
	 * @generated
	 */
	int COURSETYPE = 44;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSETYPE__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSETYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSETYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSETYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Coursetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSETYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lobj.impl.ExternalMetadataImpl <em>External Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ExternalMetadataImpl
	 * @see lobj.impl.LobjPackageImpl#getExternalMetadata()
	 * @generated
	 */
	int EXTERNAL_METADATA = 45;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_METADATA__REF = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_METADATA__FILE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_METADATA__ID = 2;

	/**
	 * The number of structural features of the '<em>External Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_METADATA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lobj.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.LanguageImpl
	 * @see lobj.impl.LobjPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 46;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link lobj.impl.PrecognitionImpl <em>Precognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.PrecognitionImpl
	 * @see lobj.impl.LobjPackageImpl#getPrecognition()
	 * @generated
	 */
	int PRECOGNITION = 47;

	/**
	 * The feature id for the '<em><b>Precog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECOGNITION__PRECOG = 0;

	/**
	 * The feature id for the '<em><b>Internal Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECOGNITION__INTERNAL_REFS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECOGNITION__ID = 2;

	/**
	 * The number of structural features of the '<em>Precognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECOGNITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link lobj.impl.InternalRefImpl <em>Internal Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.InternalRefImpl
	 * @see lobj.impl.LobjPackageImpl#getInternalRef()
	 * @generated
	 */
	int INTERNAL_REF = 48;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REF__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REF__REF = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REF__FILE = 2;

	/**
	 * The feature id for the '<em><b>Reftype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REF__REFTYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REF__ID = 4;

	/**
	 * The number of structural features of the '<em>Internal Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_REF_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link lobj.impl.ModuleMetaImpl <em>Module Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.ModuleMetaImpl
	 * @see lobj.impl.LobjPackageImpl#getModuleMeta()
	 * @generated
	 */
	int MODULE_META = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_META__ID = LEARNING_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_META__TIMESTAMP = LEARNING_OBJECT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_META__SYNCHRONIZED = LEARNING_OBJECT__SYNCHRONIZED;

	/**
	 * The feature id for the '<em><b>Didac Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_META__DIDAC_META = LEARNING_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_META__CREATION_DATE = LEARNING_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_META__AUTHORS = LEARNING_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Publish Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_META__PUBLISH_INFO = LEARNING_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Def Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_META__DEF_LANG = LEARNING_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Module Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_META_FEATURE_COUNT = LEARNING_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link lobj.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.SourceImpl
	 * @see lobj.impl.LobjPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 50;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SUBTITLE = 2;

	/**
	 * The feature id for the '<em><b>Published In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PUBLISHED_IN = 3;

	/**
	 * The feature id for the '<em><b>Published By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PUBLISHED_BY = 4;

	/**
	 * The feature id for the '<em><b>Publish Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PUBLISH_DATE = 5;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ID = 7;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link lobj.impl.AuthorizationTypesImpl <em>Authorization Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.AuthorizationTypesImpl
	 * @see lobj.impl.LobjPackageImpl#getAuthorizationTypes()
	 * @generated
	 */
	int AUTHORIZATION_TYPES = 51;

	/**
	 * The feature id for the '<em><b>Auth Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_TYPES__AUTH_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Auth Type Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_TYPES__AUTH_TYPE_DESC = 1;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_TYPES__READ_ONLY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_TYPES__ID = 3;

	/**
	 * The number of structural features of the '<em>Authorization Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_TYPES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lobj.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lobj.impl.UserImpl
	 * @see lobj.impl.LobjPackageImpl#getUser()
	 * @generated
	 */
	int USER = 52;

	/**
	 * The feature id for the '<em><b>Loginname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOGINNAME = 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 1;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRSTNAME = 2;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LASTNAME = 3;

	/**
	 * The feature id for the '<em><b>Matriculationnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MATRICULATIONNR = 4;

	/**
	 * The feature id for the '<em><b>Scn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SCN = 5;

	/**
	 * The feature id for the '<em><b>Icqnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ICQNUMBER = 6;

	/**
	 * The feature id for the '<em><b>Icqpassword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ICQPASSWORD = 7;

	/**
	 * The feature id for the '<em><b>Entryasxml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ENTRYASXML = 8;

	/**
	 * The feature id for the '<em><b>Languagenr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LANGUAGENR = 9;

	/**
	 * The feature id for the '<em><b>Notificationprofileasxml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NOTIFICATIONPROFILEASXML = 10;

	/**
	 * The feature id for the '<em><b>Dossierasxml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DOSSIERASXML = 11;

	/**
	 * The feature id for the '<em><b>Photo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PHOTO = 12;

	/**
	 * The feature id for the '<em><b>Onlinestatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ONLINESTATUS = 13;

	/**
	 * The feature id for the '<em><b>Onlinedate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ONLINEDATE = 14;

	/**
	 * The feature id for the '<em><b>Datafilter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DATAFILTER = 15;

	/**
	 * The feature id for the '<em><b>Inchatsince</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__INCHATSINCE = 16;

	/**
	 * The feature id for the '<em><b>Contchatdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONTCHATDATE = 17;

	/**
	 * The feature id for the '<em><b>Chatroomnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CHATROOMNR = 18;

	/**
	 * The feature id for the '<em><b>Fromext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FROMEXT = 19;

	/**
	 * The feature id for the '<em><b>Lastlogindate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LASTLOGINDATE = 20;

	/**
	 * The feature id for the '<em><b>Currlogindate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CURRLOGINDATE = 21;

	/**
	 * The feature id for the '<em><b>Lastcoursematerialnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LASTCOURSEMATERIALNR = 22;

	/**
	 * The feature id for the '<em><b>Lastcoursematerialviewnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LASTCOURSEMATERIALVIEWNR = 23;

	/**
	 * The feature id for the '<em><b>Authenticateldap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AUTHENTICATELDAP = 24;

	/**
	 * The feature id for the '<em><b>Photochanged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PHOTOCHANGED = 25;

	/**
	 * The feature id for the '<em><b>Authorizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AUTHORIZATIONS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 27;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 28;


	/**
	 * Returns the meta object for class '{@link lobj.LearningObject <em>Learning Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Object</em>'.
	 * @see lobj.LearningObject
	 * @generated
	 */
	EClass getLearningObject();

	/**
	 * Returns the meta object for the attribute '{@link lobj.LearningObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.LearningObject#getId()
	 * @see #getLearningObject()
	 * @generated
	 */
	EAttribute getLearningObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link lobj.LearningObject#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see lobj.LearningObject#getTimestamp()
	 * @see #getLearningObject()
	 * @generated
	 */
	EAttribute getLearningObject_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link lobj.LearningObject#isSynchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronized</em>'.
	 * @see lobj.LearningObject#isSynchronized()
	 * @see #getLearningObject()
	 * @generated
	 */
	EAttribute getLearningObject_Synchronized();

	/**
	 * Returns the meta object for class '{@link lobj.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see lobj.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Block#getBlockMeta <em>Block Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block Meta</em>'.
	 * @see lobj.Block#getBlockMeta()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_BlockMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Block#getExternalMetadata <em>External Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Metadata</em>'.
	 * @see lobj.Block#getExternalMetadata()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_ExternalMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Block#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see lobj.Block#getAccessControl()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_AccessControl();

	/**
	 * Returns the meta object for class '{@link lobj.HypertextBlock <em>Hypertext Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypertext Block</em>'.
	 * @see lobj.HypertextBlock
	 * @generated
	 */
	EClass getHypertextBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.HypertextBlock#getHypertextContent <em>Hypertext Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hypertext Content</em>'.
	 * @see lobj.HypertextBlock#getHypertextContent()
	 * @see #getHypertextBlock()
	 * @generated
	 */
	EReference getHypertextBlock_HypertextContent();

	/**
	 * Returns the meta object for class '{@link lobj.AbstractContent <em>Abstract Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Content</em>'.
	 * @see lobj.AbstractContent
	 * @generated
	 */
	EClass getAbstractContent();

	/**
	 * Returns the meta object for the attribute '{@link lobj.AbstractContent#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see lobj.AbstractContent#getHeading()
	 * @see #getAbstractContent()
	 * @generated
	 */
	EAttribute getAbstractContent_Heading();

	/**
	 * Returns the meta object for the reference '{@link lobj.AbstractContent#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see lobj.AbstractContent#getLanguage()
	 * @see #getAbstractContent()
	 * @generated
	 */
	EReference getAbstractContent_Language();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.AbstractContent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see lobj.AbstractContent#getSource()
	 * @see #getAbstractContent()
	 * @generated
	 */
	EReference getAbstractContent_Source();

	/**
	 * Returns the meta object for class '{@link lobj.HypertextContent <em>Hypertext Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hypertext Content</em>'.
	 * @see lobj.HypertextContent
	 * @generated
	 */
	EClass getHypertextContent();

	/**
	 * Returns the meta object for the attribute '{@link lobj.HypertextContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see lobj.HypertextContent#getContent()
	 * @see #getHypertextContent()
	 * @generated
	 */
	EAttribute getHypertextContent_Content();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.HypertextContent#getBlockAudiofile <em>Block Audiofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block Audiofile</em>'.
	 * @see lobj.HypertextContent#getBlockAudiofile()
	 * @see #getHypertextContent()
	 * @generated
	 */
	EReference getHypertextContent_BlockAudiofile();

	/**
	 * Returns the meta object for the reference list '{@link lobj.HypertextContent#getResrcFile <em>Resrc File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resrc File</em>'.
	 * @see lobj.HypertextContent#getResrcFile()
	 * @see #getHypertextContent()
	 * @generated
	 */
	EReference getHypertextContent_ResrcFile();

	/**
	 * Returns the meta object for class '{@link lobj.BlockFolder <em>Block Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Folder</em>'.
	 * @see lobj.BlockFolder
	 * @generated
	 */
	EClass getBlockFolder();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.BlockFolder#getFolderMeta <em>Folder Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Folder Meta</em>'.
	 * @see lobj.BlockFolder#getFolderMeta()
	 * @see #getBlockFolder()
	 * @generated
	 */
	EReference getBlockFolder_FolderMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.BlockFolder#getBlockFolder <em>Block Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Folder</em>'.
	 * @see lobj.BlockFolder#getBlockFolder()
	 * @see #getBlockFolder()
	 * @generated
	 */
	EReference getBlockFolder_BlockFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.BlockFolder#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see lobj.BlockFolder#getBlock()
	 * @see #getBlockFolder()
	 * @generated
	 */
	EReference getBlockFolder_Block();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.BlockFolder#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see lobj.BlockFolder#getAccessControl()
	 * @see #getBlockFolder()
	 * @generated
	 */
	EReference getBlockFolder_AccessControl();

	/**
	 * Returns the meta object for class '{@link lobj.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see lobj.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Category#getTitleMeta <em>Title Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title Meta</em>'.
	 * @see lobj.Category#getTitleMeta()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_TitleMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Category#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course</em>'.
	 * @see lobj.Category#getCourse()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Course();

	/**
	 * Returns the meta object for class '{@link lobj.CorrBlock <em>Corr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr Block</em>'.
	 * @see lobj.CorrBlock
	 * @generated
	 */
	EClass getCorrBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.CorrBlock#getPresentationBlock <em>Presentation Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Presentation Block</em>'.
	 * @see lobj.CorrBlock#getPresentationBlock()
	 * @see #getCorrBlock()
	 * @generated
	 */
	EReference getCorrBlock_PresentationBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.CorrBlock#getTitleMeta <em>Title Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title Meta</em>'.
	 * @see lobj.CorrBlock#getTitleMeta()
	 * @see #getCorrBlock()
	 * @generated
	 */
	EReference getCorrBlock_TitleMeta();

	/**
	 * Returns the meta object for the attribute '{@link lobj.CorrBlock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.CorrBlock#getId()
	 * @see #getCorrBlock()
	 * @generated
	 */
	EAttribute getCorrBlock_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see lobj.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Course#getCourseMeta <em>Course Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Course Meta</em>'.
	 * @see lobj.Course#getCourseMeta()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_CourseMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Course#getExternalMetadata <em>External Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Metadata</em>'.
	 * @see lobj.Course#getExternalMetadata()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_ExternalMetadata();

	/**
	 * Returns the meta object for the reference '{@link lobj.Course#getCoursetype <em>Coursetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coursetype</em>'.
	 * @see lobj.Course#getCoursetype()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Coursetype();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Course#getOutlineAsXml <em>Outline As Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline As Xml</em>'.
	 * @see lobj.Course#getOutlineAsXml()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_OutlineAsXml();

	/**
	 * Returns the meta object for the reference list '{@link lobj.Course#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Module</em>'.
	 * @see lobj.Course#getModule()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Module();

	/**
	 * Returns the meta object for class '{@link lobj.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see lobj.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Item#getCorrBlock <em>Corr Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Corr Block</em>'.
	 * @see lobj.Item#getCorrBlock()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_CorrBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Item#getChilditems <em>Childitems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childitems</em>'.
	 * @see lobj.Item#getChilditems()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Childitems();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Item#getLuRef <em>Lu Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lu Ref</em>'.
	 * @see lobj.Item#getLuRef()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_LuRef();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Item#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Item#getId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Id();

	/**
	 * Returns the meta object for class '{@link lobj.LearningUnit <em>Learning Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Unit</em>'.
	 * @see lobj.LearningUnit
	 * @generated
	 */
	EClass getLearningUnit();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.LearningUnit#getLuMeta <em>Lu Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lu Meta</em>'.
	 * @see lobj.LearningUnit#getLuMeta()
	 * @see #getLearningUnit()
	 * @generated
	 */
	EReference getLearningUnit_LuMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.LearningUnit#getExternalMetadata <em>External Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Metadata</em>'.
	 * @see lobj.LearningUnit#getExternalMetadata()
	 * @see #getLearningUnit()
	 * @generated
	 */
	EReference getLearningUnit_ExternalMetadata();

	/**
	 * Returns the meta object for the attribute '{@link lobj.LearningUnit#getTreeAsXml <em>Tree As Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree As Xml</em>'.
	 * @see lobj.LearningUnit#getTreeAsXml()
	 * @see #getLearningUnit()
	 * @generated
	 */
	EAttribute getLearningUnit_TreeAsXml();

	/**
	 * Returns the meta object for the attribute '{@link lobj.LearningUnit#getLuFile <em>Lu File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lu File</em>'.
	 * @see lobj.LearningUnit#getLuFile()
	 * @see #getLearningUnit()
	 * @generated
	 */
	EAttribute getLearningUnit_LuFile();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.LearningUnit#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see lobj.LearningUnit#getAccessControl()
	 * @see #getLearningUnit()
	 * @generated
	 */
	EReference getLearningUnit_AccessControl();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.LearningUnit#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see lobj.LearningUnit#getItem()
	 * @see #getLearningUnit()
	 * @generated
	 */
	EReference getLearningUnit_Item();

	/**
	 * Returns the meta object for class '{@link lobj.LuFolder <em>Lu Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lu Folder</em>'.
	 * @see lobj.LuFolder
	 * @generated
	 */
	EClass getLuFolder();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.LuFolder#getFolderMeta <em>Folder Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Folder Meta</em>'.
	 * @see lobj.LuFolder#getFolderMeta()
	 * @see #getLuFolder()
	 * @generated
	 */
	EReference getLuFolder_FolderMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.LuFolder#getLuFolder <em>Lu Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lu Folder</em>'.
	 * @see lobj.LuFolder#getLuFolder()
	 * @see #getLuFolder()
	 * @generated
	 */
	EReference getLuFolder_LuFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.LuFolder#getLearningUnit <em>Learning Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learning Unit</em>'.
	 * @see lobj.LuFolder#getLearningUnit()
	 * @see #getLuFolder()
	 * @generated
	 */
	EReference getLuFolder_LearningUnit();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.LuFolder#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see lobj.LuFolder#getAccessControl()
	 * @see #getLuFolder()
	 * @generated
	 */
	EReference getLuFolder_AccessControl();

	/**
	 * Returns the meta object for class '{@link lobj.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see lobj.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Module#getModuleMeta <em>Module Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Meta</em>'.
	 * @see lobj.Module#getModuleMeta()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModuleMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Module#getExternalMetadata <em>External Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Metadata</em>'.
	 * @see lobj.Module#getExternalMetadata()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ExternalMetadata();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Module#getRootNode <em>Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Node</em>'.
	 * @see lobj.Module#getRootNode()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_RootNode();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Module#getModuleFile <em>Module File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module File</em>'.
	 * @see lobj.Module#getModuleFile()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_ModuleFile();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Module#getTreeAsXml <em>Tree As Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree As Xml</em>'.
	 * @see lobj.Module#getTreeAsXml()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_TreeAsXml();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Module#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see lobj.Module#getAccessControl()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_AccessControl();

	/**
	 * Returns the meta object for class '{@link lobj.ModuleFolder <em>Module Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Folder</em>'.
	 * @see lobj.ModuleFolder
	 * @generated
	 */
	EClass getModuleFolder();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.ModuleFolder#getFolderMeta <em>Folder Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Folder Meta</em>'.
	 * @see lobj.ModuleFolder#getFolderMeta()
	 * @see #getModuleFolder()
	 * @generated
	 */
	EReference getModuleFolder_FolderMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.ModuleFolder#getModuleFolder <em>Module Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Folder</em>'.
	 * @see lobj.ModuleFolder#getModuleFolder()
	 * @see #getModuleFolder()
	 * @generated
	 */
	EReference getModuleFolder_ModuleFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.ModuleFolder#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see lobj.ModuleFolder#getModule()
	 * @see #getModuleFolder()
	 * @generated
	 */
	EReference getModuleFolder_Module();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.ModuleFolder#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see lobj.ModuleFolder#getAccessControl()
	 * @see #getModuleFolder()
	 * @generated
	 */
	EReference getModuleFolder_AccessControl();

	/**
	 * Returns the meta object for class '{@link lobj.ResrcFolder <em>Resrc Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resrc Folder</em>'.
	 * @see lobj.ResrcFolder
	 * @generated
	 */
	EClass getResrcFolder();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.ResrcFolder#getFolderMeta <em>Folder Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Folder Meta</em>'.
	 * @see lobj.ResrcFolder#getFolderMeta()
	 * @see #getResrcFolder()
	 * @generated
	 */
	EReference getResrcFolder_FolderMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.ResrcFolder#getResrcFolder <em>Resrc Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resrc Folder</em>'.
	 * @see lobj.ResrcFolder#getResrcFolder()
	 * @see #getResrcFolder()
	 * @generated
	 */
	EReference getResrcFolder_ResrcFolder();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.ResrcFolder#getAccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Control</em>'.
	 * @see lobj.ResrcFolder#getAccessControl()
	 * @see #getResrcFolder()
	 * @generated
	 */
	EReference getResrcFolder_AccessControl();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFolder#isDeleteScheduled <em>Delete Scheduled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Scheduled</em>'.
	 * @see lobj.ResrcFolder#isDeleteScheduled()
	 * @see #getResrcFolder()
	 * @generated
	 */
	EAttribute getResrcFolder_DeleteScheduled();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.ResrcFolder#getResrcFile <em>Resrc File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resrc File</em>'.
	 * @see lobj.ResrcFolder#getResrcFile()
	 * @see #getResrcFolder()
	 * @generated
	 */
	EReference getResrcFolder_ResrcFile();

	/**
	 * Returns the meta object for class '{@link lobj.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theme</em>'.
	 * @see lobj.Theme
	 * @generated
	 */
	EClass getTheme();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Theme#getSimpleDidacMeta <em>Simple Didac Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Didac Meta</em>'.
	 * @see lobj.Theme#getSimpleDidacMeta()
	 * @see #getTheme()
	 * @generated
	 */
	EReference getTheme_SimpleDidacMeta();

	/**
	 * Returns the meta object for class '{@link lobj.PresentationBlock <em>Presentation Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation Block</em>'.
	 * @see lobj.PresentationBlock
	 * @generated
	 */
	EClass getPresentationBlock();

	/**
	 * Returns the meta object for the attribute '{@link lobj.PresentationBlock#getLod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lod</em>'.
	 * @see lobj.PresentationBlock#getLod()
	 * @see #getPresentationBlock()
	 * @generated
	 */
	EAttribute getPresentationBlock_Lod();

	/**
	 * Returns the meta object for the attribute '{@link lobj.PresentationBlock#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rendering</em>'.
	 * @see lobj.PresentationBlock#getRendering()
	 * @see #getPresentationBlock()
	 * @generated
	 */
	EAttribute getPresentationBlock_Rendering();

	/**
	 * Returns the meta object for the reference '{@link lobj.PresentationBlock#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Block</em>'.
	 * @see lobj.PresentationBlock#getBlock()
	 * @see #getPresentationBlock()
	 * @generated
	 */
	EReference getPresentationBlock_Block();

	/**
	 * Returns the meta object for the attribute '{@link lobj.PresentationBlock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.PresentationBlock#getId()
	 * @see #getPresentationBlock()
	 * @generated
	 */
	EAttribute getPresentationBlock_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see lobj.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Node#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see lobj.Node#isVisible()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Visible();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for class '{@link lobj.ThemeNode <em>Theme Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theme Node</em>'.
	 * @see lobj.ThemeNode
	 * @generated
	 */
	EClass getThemeNode();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.ThemeNode#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Theme</em>'.
	 * @see lobj.ThemeNode#getTheme()
	 * @see #getThemeNode()
	 * @generated
	 */
	EReference getThemeNode_Theme();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.ThemeNode#getChildnodes <em>Childnodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childnodes</em>'.
	 * @see lobj.ThemeNode#getChildnodes()
	 * @see #getThemeNode()
	 * @generated
	 */
	EReference getThemeNode_Childnodes();

	/**
	 * Returns the meta object for class '{@link lobj.LuNode <em>Lu Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lu Node</em>'.
	 * @see lobj.LuNode
	 * @generated
	 */
	EClass getLuNode();

	/**
	 * Returns the meta object for the reference '{@link lobj.LuNode#getLearningUnit <em>Learning Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Learning Unit</em>'.
	 * @see lobj.LuNode#getLearningUnit()
	 * @see #getLuNode()
	 * @generated
	 */
	EReference getLuNode_LearningUnit();

	/**
	 * Returns the meta object for class '{@link lobj.ResrcFile <em>Resrc File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resrc File</em>'.
	 * @see lobj.ResrcFile
	 * @generated
	 */
	EClass getResrcFile();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFile#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see lobj.ResrcFile#getFile()
	 * @see #getResrcFile()
	 * @generated
	 */
	EAttribute getResrcFile_File();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFile#getFile_tn <em>File tn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File tn</em>'.
	 * @see lobj.ResrcFile#getFile_tn()
	 * @see #getResrcFile()
	 * @generated
	 */
	EAttribute getResrcFile_File_tn();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFile#getOriginalextension <em>Originalextension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originalextension</em>'.
	 * @see lobj.ResrcFile#getOriginalextension()
	 * @see #getResrcFile()
	 * @generated
	 */
	EAttribute getResrcFile_Originalextension();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFile#getFilesize <em>Filesize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filesize</em>'.
	 * @see lobj.ResrcFile#getFilesize()
	 * @see #getResrcFile()
	 * @generated
	 */
	EAttribute getResrcFile_Filesize();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFile#getResrcHref <em>Resrc Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resrc Href</em>'.
	 * @see lobj.ResrcFile#getResrcHref()
	 * @see #getResrcFile()
	 * @generated
	 */
	EAttribute getResrcFile_ResrcHref();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.ResrcFile#getAccesscontrol <em>Accesscontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accesscontrol</em>'.
	 * @see lobj.ResrcFile#getAccesscontrol()
	 * @see #getResrcFile()
	 * @generated
	 */
	EReference getResrcFile_Accesscontrol();

	/**
	 * Returns the meta object for the reference '{@link lobj.ResrcFile#getResrcFiletype <em>Resrc Filetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resrc Filetype</em>'.
	 * @see lobj.ResrcFile#getResrcFiletype()
	 * @see #getResrcFile()
	 * @generated
	 */
	EReference getResrcFile_ResrcFiletype();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.ResrcFile#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see lobj.ResrcFile#getSource()
	 * @see #getResrcFile()
	 * @generated
	 */
	EReference getResrcFile_Source();

	/**
	 * Returns the meta object for the reference list '{@link lobj.ResrcFile#getHypertextContent <em>Hypertext Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hypertext Content</em>'.
	 * @see lobj.ResrcFile#getHypertextContent()
	 * @see #getResrcFile()
	 * @generated
	 */
	EReference getResrcFile_HypertextContent();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.ResrcFile#getResrcMeta <em>Resrc Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resrc Meta</em>'.
	 * @see lobj.ResrcFile#getResrcMeta()
	 * @see #getResrcFile()
	 * @generated
	 */
	EReference getResrcFile_ResrcMeta();

	/**
	 * Returns the meta object for class '{@link lobj.BlockAudiofile <em>Block Audiofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Audiofile</em>'.
	 * @see lobj.BlockAudiofile
	 * @generated
	 */
	EClass getBlockAudiofile();

	/**
	 * Returns the meta object for the attribute '{@link lobj.BlockAudiofile#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see lobj.BlockAudiofile#getFile()
	 * @see #getBlockAudiofile()
	 * @generated
	 */
	EAttribute getBlockAudiofile_File();

	/**
	 * Returns the meta object for the attribute '{@link lobj.BlockAudiofile#getOriginalextension <em>Originalextension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Originalextension</em>'.
	 * @see lobj.BlockAudiofile#getOriginalextension()
	 * @see #getBlockAudiofile()
	 * @generated
	 */
	EAttribute getBlockAudiofile_Originalextension();

	/**
	 * Returns the meta object for the attribute '{@link lobj.BlockAudiofile#getFilesize <em>Filesize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filesize</em>'.
	 * @see lobj.BlockAudiofile#getFilesize()
	 * @see #getBlockAudiofile()
	 * @generated
	 */
	EAttribute getBlockAudiofile_Filesize();

	/**
	 * Returns the meta object for the attribute '{@link lobj.BlockAudiofile#getResrcHref <em>Resrc Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resrc Href</em>'.
	 * @see lobj.BlockAudiofile#getResrcHref()
	 * @see #getBlockAudiofile()
	 * @generated
	 */
	EAttribute getBlockAudiofile_ResrcHref();

	/**
	 * Returns the meta object for the reference '{@link lobj.BlockAudiofile#getResrcFiletype <em>Resrc Filetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resrc Filetype</em>'.
	 * @see lobj.BlockAudiofile#getResrcFiletype()
	 * @see #getBlockAudiofile()
	 * @generated
	 */
	EReference getBlockAudiofile_ResrcFiletype();

	/**
	 * Returns the meta object for class '{@link lobj.ResrcFiletype <em>Resrc Filetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resrc Filetype</em>'.
	 * @see lobj.ResrcFiletype
	 * @generated
	 */
	EClass getResrcFiletype();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFiletype#getFiletypeExtension <em>Filetype Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filetype Extension</em>'.
	 * @see lobj.ResrcFiletype#getFiletypeExtension()
	 * @see #getResrcFiletype()
	 * @generated
	 */
	EAttribute getResrcFiletype_FiletypeExtension();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFiletype#getFiletypeDesc <em>Filetype Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filetype Desc</em>'.
	 * @see lobj.ResrcFiletype#getFiletypeDesc()
	 * @see #getResrcFiletype()
	 * @generated
	 */
	EAttribute getResrcFiletype_FiletypeDesc();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFiletype#isImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see lobj.ResrcFiletype#isImage()
	 * @see #getResrcFiletype()
	 * @generated
	 */
	EAttribute getResrcFiletype_Image();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFiletype#isApplet <em>Applet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applet</em>'.
	 * @see lobj.ResrcFiletype#isApplet()
	 * @see #getResrcFiletype()
	 * @generated
	 */
	EAttribute getResrcFiletype_Applet();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFiletype#getFiletypeImageSmall <em>Filetype Image Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filetype Image Small</em>'.
	 * @see lobj.ResrcFiletype#getFiletypeImageSmall()
	 * @see #getResrcFiletype()
	 * @generated
	 */
	EAttribute getResrcFiletype_FiletypeImageSmall();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFiletype#getFiletypeImageBif <em>Filetype Image Bif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filetype Image Bif</em>'.
	 * @see lobj.ResrcFiletype#getFiletypeImageBif()
	 * @see #getResrcFiletype()
	 * @generated
	 */
	EAttribute getResrcFiletype_FiletypeImageBif();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcFiletype#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.ResrcFiletype#getId()
	 * @see #getResrcFiletype()
	 * @generated
	 */
	EAttribute getResrcFiletype_Id();

	/**
	 * Returns the meta object for class '{@link lobj.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control</em>'.
	 * @see lobj.AccessControl
	 * @generated
	 */
	EClass getAccessControl();

	/**
	 * Returns the meta object for the reference '{@link lobj.AccessControl#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see lobj.AccessControl#getOwner()
	 * @see #getAccessControl()
	 * @generated
	 */
	EReference getAccessControl_Owner();

	/**
	 * Returns the meta object for the attribute '{@link lobj.AccessControl#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see lobj.AccessControl#getLastModified()
	 * @see #getAccessControl()
	 * @generated
	 */
	EAttribute getAccessControl_LastModified();

	/**
	 * Returns the meta object for the reference '{@link lobj.AccessControl#getLastModifiedBy <em>Last Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By</em>'.
	 * @see lobj.AccessControl#getLastModifiedBy()
	 * @see #getAccessControl()
	 * @generated
	 */
	EReference getAccessControl_LastModifiedBy();

	/**
	 * Returns the meta object for the attribute '{@link lobj.AccessControl#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see lobj.AccessControl#getStatus()
	 * @see #getAccessControl()
	 * @generated
	 */
	EAttribute getAccessControl_Status();

	/**
	 * Returns the meta object for the attribute '{@link lobj.AccessControl#getLastStatusChange <em>Last Status Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Status Change</em>'.
	 * @see lobj.AccessControl#getLastStatusChange()
	 * @see #getAccessControl()
	 * @generated
	 */
	EAttribute getAccessControl_LastStatusChange();

	/**
	 * Returns the meta object for the reference '{@link lobj.AccessControl#getLastStatusChangeBy <em>Last Status Change By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Status Change By</em>'.
	 * @see lobj.AccessControl#getLastStatusChangeBy()
	 * @see #getAccessControl()
	 * @generated
	 */
	EReference getAccessControl_LastStatusChangeBy();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.AccessControl#getSharednotes <em>Sharednotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sharednotes</em>'.
	 * @see lobj.AccessControl#getSharednotes()
	 * @see #getAccessControl()
	 * @generated
	 */
	EReference getAccessControl_Sharednotes();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.AccessControl#getAuthorizes <em>Authorizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorizes</em>'.
	 * @see lobj.AccessControl#getAuthorizes()
	 * @see #getAccessControl()
	 * @generated
	 */
	EReference getAccessControl_Authorizes();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.AccessControl#getEditionHistory <em>Edition History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edition History</em>'.
	 * @see lobj.AccessControl#getEditionHistory()
	 * @see #getAccessControl()
	 * @generated
	 */
	EReference getAccessControl_EditionHistory();

	/**
	 * Returns the meta object for the attribute '{@link lobj.AccessControl#isGlobalAccess <em>Global Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Access</em>'.
	 * @see lobj.AccessControl#isGlobalAccess()
	 * @see #getAccessControl()
	 * @generated
	 */
	EAttribute getAccessControl_GlobalAccess();

	/**
	 * Returns the meta object for the attribute '{@link lobj.AccessControl#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.AccessControl#getId()
	 * @see #getAccessControl()
	 * @generated
	 */
	EAttribute getAccessControl_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see lobj.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see lobj.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Address#getPostcode <em>Postcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcode</em>'.
	 * @see lobj.Address#getPostcode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Postcode();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see lobj.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Address#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see lobj.Address#getState()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_State();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see lobj.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Address#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see lobj.Address#getPhone()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Phone();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Address#getFax <em>Fax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fax</em>'.
	 * @see lobj.Address#getFax()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Fax();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Address#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see lobj.Address#getEmail()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Email();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Address#getOtheraddr <em>Otheraddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Otheraddr</em>'.
	 * @see lobj.Address#getOtheraddr()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Otheraddr();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Address#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Address#getId()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Affiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affiliation</em>'.
	 * @see lobj.Affiliation
	 * @generated
	 */
	EClass getAffiliation();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Affiliation#getShortaffil <em>Shortaffil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shortaffil</em>'.
	 * @see lobj.Affiliation#getShortaffil()
	 * @see #getAffiliation()
	 * @generated
	 */
	EAttribute getAffiliation_Shortaffil();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Affiliation#getJobtitle <em>Jobtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobtitle</em>'.
	 * @see lobj.Affiliation#getJobtitle()
	 * @see #getAffiliation()
	 * @generated
	 */
	EAttribute getAffiliation_Jobtitle();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Affiliation#getOrgname <em>Orgname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orgname</em>'.
	 * @see lobj.Affiliation#getOrgname()
	 * @see #getAffiliation()
	 * @generated
	 */
	EAttribute getAffiliation_Orgname();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Affiliation#getOrgdiv <em>Orgdiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orgdiv</em>'.
	 * @see lobj.Affiliation#getOrgdiv()
	 * @see #getAffiliation()
	 * @generated
	 */
	EAttribute getAffiliation_Orgdiv();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Affiliation#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see lobj.Affiliation#getAddress()
	 * @see #getAffiliation()
	 * @generated
	 */
	EReference getAffiliation_Address();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Affiliation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Affiliation#getId()
	 * @see #getAffiliation()
	 * @generated
	 */
	EAttribute getAffiliation_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see lobj.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Author#getCredittype <em>Credittype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credittype</em>'.
	 * @see lobj.Author#getCredittype()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Credittype();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Author#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see lobj.Author#getPerson()
	 * @see #getAuthor()
	 * @generated
	 */
	EReference getAuthor_Person();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Author#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see lobj.Author#getAddress()
	 * @see #getAuthor()
	 * @generated
	 */
	EReference getAuthor_Address();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Author#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see lobj.Author#getEmail()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Email();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Author#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Author#getId()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Id();

	/**
	 * Returns the meta object for class '{@link lobj.BlockMeta <em>Block Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Meta</em>'.
	 * @see lobj.BlockMeta
	 * @generated
	 */
	EClass getBlockMeta();

	/**
	 * Returns the meta object for the attribute '{@link lobj.BlockMeta#getLod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lod</em>'.
	 * @see lobj.BlockMeta#getLod()
	 * @see #getBlockMeta()
	 * @generated
	 */
	EAttribute getBlockMeta_Lod();

	/**
	 * Returns the meta object for the attribute '{@link lobj.BlockMeta#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rendering</em>'.
	 * @see lobj.BlockMeta#getRendering()
	 * @see #getBlockMeta()
	 * @generated
	 */
	EAttribute getBlockMeta_Rendering();

	/**
	 * Returns the meta object for the reference '{@link lobj.BlockMeta#getBlocktype <em>Blocktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Blocktype</em>'.
	 * @see lobj.BlockMeta#getBlocktype()
	 * @see #getBlockMeta()
	 * @generated
	 */
	EReference getBlockMeta_Blocktype();

	/**
	 * Returns the meta object for the attribute '{@link lobj.BlockMeta#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see lobj.BlockMeta#getCreationDate()
	 * @see #getBlockMeta()
	 * @generated
	 */
	EAttribute getBlockMeta_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link lobj.BlockMeta#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see lobj.BlockMeta#getLastModified()
	 * @see #getBlockMeta()
	 * @generated
	 */
	EAttribute getBlockMeta_LastModified();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.BlockMeta#getSimpleDidacMeta <em>Simple Didac Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Didac Meta</em>'.
	 * @see lobj.BlockMeta#getSimpleDidacMeta()
	 * @see #getBlockMeta()
	 * @generated
	 */
	EReference getBlockMeta_SimpleDidacMeta();

	/**
	 * Returns the meta object for the reference '{@link lobj.BlockMeta#getDefLang <em>Def Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def Lang</em>'.
	 * @see lobj.BlockMeta#getDefLang()
	 * @see #getBlockMeta()
	 * @generated
	 */
	EReference getBlockMeta_DefLang();

	/**
	 * Returns the meta object for class '{@link lobj.Blocktype <em>Blocktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blocktype</em>'.
	 * @see lobj.Blocktype
	 * @generated
	 */
	EClass getBlocktype();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Blocktype#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lobj.Blocktype#getName()
	 * @see #getBlocktype()
	 * @generated
	 */
	EAttribute getBlocktype_Name();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Blocktype#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see lobj.Blocktype#getDescription()
	 * @see #getBlocktype()
	 * @generated
	 */
	EAttribute getBlocktype_Description();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Blocktype#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see lobj.Blocktype#getCreationDate()
	 * @see #getBlocktype()
	 * @generated
	 */
	EAttribute getBlocktype_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Blocktype#getStyleRef <em>Style Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Ref</em>'.
	 * @see lobj.Blocktype#getStyleRef()
	 * @see #getBlocktype()
	 * @generated
	 */
	EAttribute getBlocktype_StyleRef();

	/**
	 * Returns the meta object for the reference list '{@link lobj.Blocktype#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domains</em>'.
	 * @see lobj.Blocktype#getDomains()
	 * @see #getBlocktype()
	 * @generated
	 */
	EReference getBlocktype_Domains();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Blocktype#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Blocktype#getId()
	 * @see #getBlocktype()
	 * @generated
	 */
	EAttribute getBlocktype_Id();

	/**
	 * Returns the meta object for class '{@link lobj.TitleMeta <em>Title Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Meta</em>'.
	 * @see lobj.TitleMeta
	 * @generated
	 */
	EClass getTitleMeta();

	/**
	 * Returns the meta object for the reference '{@link lobj.TitleMeta#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see lobj.TitleMeta#getLanguage()
	 * @see #getTitleMeta()
	 * @generated
	 */
	EReference getTitleMeta_Language();

	/**
	 * Returns the meta object for the attribute '{@link lobj.TitleMeta#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see lobj.TitleMeta#getTitle()
	 * @see #getTitleMeta()
	 * @generated
	 */
	EAttribute getTitleMeta_Title();

	/**
	 * Returns the meta object for the attribute '{@link lobj.TitleMeta#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.TitleMeta#getId()
	 * @see #getTitleMeta()
	 * @generated
	 */
	EAttribute getTitleMeta_Id();

	/**
	 * Returns the meta object for class '{@link lobj.CourseMeta <em>Course Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Meta</em>'.
	 * @see lobj.CourseMeta
	 * @generated
	 */
	EClass getCourseMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.CourseMeta#getDidacMeta <em>Didac Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Didac Meta</em>'.
	 * @see lobj.CourseMeta#getDidacMeta()
	 * @see #getCourseMeta()
	 * @generated
	 */
	EReference getCourseMeta_DidacMeta();

	/**
	 * Returns the meta object for the attribute '{@link lobj.CourseMeta#getHours <em>Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hours</em>'.
	 * @see lobj.CourseMeta#getHours()
	 * @see #getCourseMeta()
	 * @generated
	 */
	EAttribute getCourseMeta_Hours();

	/**
	 * Returns the meta object for the attribute '{@link lobj.CourseMeta#getLvanr <em>Lvanr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lvanr</em>'.
	 * @see lobj.CourseMeta#getLvanr()
	 * @see #getCourseMeta()
	 * @generated
	 */
	EAttribute getCourseMeta_Lvanr();

	/**
	 * Returns the meta object for the attribute '{@link lobj.CourseMeta#getColumnfilterasxml <em>Columnfilterasxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columnfilterasxml</em>'.
	 * @see lobj.CourseMeta#getColumnfilterasxml()
	 * @see #getCourseMeta()
	 * @generated
	 */
	EAttribute getCourseMeta_Columnfilterasxml();

	/**
	 * Returns the meta object for the attribute '{@link lobj.CourseMeta#getFromext <em>Fromext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fromext</em>'.
	 * @see lobj.CourseMeta#getFromext()
	 * @see #getCourseMeta()
	 * @generated
	 */
	EAttribute getCourseMeta_Fromext();

	/**
	 * Returns the meta object for the attribute '{@link lobj.CourseMeta#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see lobj.CourseMeta#getCreationDate()
	 * @see #getCourseMeta()
	 * @generated
	 */
	EAttribute getCourseMeta_CreationDate();

	/**
	 * Returns the meta object for the reference '{@link lobj.CourseMeta#getLecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lecturer</em>'.
	 * @see lobj.CourseMeta#getLecturer()
	 * @see #getCourseMeta()
	 * @generated
	 */
	EReference getCourseMeta_Lecturer();

	/**
	 * Returns the meta object for the reference '{@link lobj.CourseMeta#getDefLang <em>Def Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def Lang</em>'.
	 * @see lobj.CourseMeta#getDefLang()
	 * @see #getCourseMeta()
	 * @generated
	 */
	EReference getCourseMeta_DefLang();

	/**
	 * Returns the meta object for class '{@link lobj.SimpleDidacMeta <em>Simple Didac Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Didac Meta</em>'.
	 * @see lobj.SimpleDidacMeta
	 * @generated
	 */
	EClass getSimpleDidacMeta();

	/**
	 * Returns the meta object for the reference '{@link lobj.SimpleDidacMeta#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see lobj.SimpleDidacMeta#getLanguage()
	 * @see #getSimpleDidacMeta()
	 * @generated
	 */
	EReference getSimpleDidacMeta_Language();

	/**
	 * Returns the meta object for the attribute '{@link lobj.SimpleDidacMeta#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see lobj.SimpleDidacMeta#getTitle()
	 * @see #getSimpleDidacMeta()
	 * @generated
	 */
	EAttribute getSimpleDidacMeta_Title();

	/**
	 * Returns the meta object for the attribute '{@link lobj.SimpleDidacMeta#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see lobj.SimpleDidacMeta#getDescription()
	 * @see #getSimpleDidacMeta()
	 * @generated
	 */
	EAttribute getSimpleDidacMeta_Description();

	/**
	 * Returns the meta object for the attribute '{@link lobj.SimpleDidacMeta#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see lobj.SimpleDidacMeta#getKeywords()
	 * @see #getSimpleDidacMeta()
	 * @generated
	 */
	EAttribute getSimpleDidacMeta_Keywords();

	/**
	 * Returns the meta object for the attribute '{@link lobj.SimpleDidacMeta#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.SimpleDidacMeta#getId()
	 * @see #getSimpleDidacMeta()
	 * @generated
	 */
	EAttribute getSimpleDidacMeta_Id();

	/**
	 * Returns the meta object for class '{@link lobj.DidacMeta <em>Didac Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Didac Meta</em>'.
	 * @see lobj.DidacMeta
	 * @generated
	 */
	EClass getDidacMeta();

	/**
	 * Returns the meta object for the attribute '{@link lobj.DidacMeta#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see lobj.DidacMeta#getGoal()
	 * @see #getDidacMeta()
	 * @generated
	 */
	EAttribute getDidacMeta_Goal();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.DidacMeta#getPrecognition <em>Precognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precognition</em>'.
	 * @see lobj.DidacMeta#getPrecognition()
	 * @see #getDidacMeta()
	 * @generated
	 */
	EReference getDidacMeta_Precognition();

	/**
	 * Returns the meta object for class '{@link lobj.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see lobj.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lobj.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Domain#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see lobj.Domain#getDescription()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Description();

	/**
	 * Returns the meta object for the reference list '{@link lobj.Domain#getBlocktypes <em>Blocktypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Blocktypes</em>'.
	 * @see lobj.Domain#getBlocktypes()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Blocktypes();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Domain#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see lobj.Domain#getCreationDate()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Domain#getServerURL <em>Server URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server URL</em>'.
	 * @see lobj.Domain#getServerURL()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_ServerURL();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Domain#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Domain#getId()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edition</em>'.
	 * @see lobj.Edition
	 * @generated
	 */
	EClass getEdition();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Edition#getEditionNr <em>Edition Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Nr</em>'.
	 * @see lobj.Edition#getEditionNr()
	 * @see #getEdition()
	 * @generated
	 */
	EAttribute getEdition_EditionNr();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Edition#getEditedBy <em>Edited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edited By</em>'.
	 * @see lobj.Edition#getEditedBy()
	 * @see #getEdition()
	 * @generated
	 */
	EAttribute getEdition_EditedBy();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Edition#isVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see lobj.Edition#isVersion()
	 * @see #getEdition()
	 * @generated
	 */
	EAttribute getEdition_Version();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Edition#getLastVersionNumber <em>Last Version Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Version Number</em>'.
	 * @see lobj.Edition#getLastVersionNumber()
	 * @see #getEdition()
	 * @generated
	 */
	EAttribute getEdition_LastVersionNumber();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Edition#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see lobj.Edition#getStatus()
	 * @see #getEdition()
	 * @generated
	 */
	EAttribute getEdition_Status();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Edition#getEditionCreationDate <em>Edition Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition Creation Date</em>'.
	 * @see lobj.Edition#getEditionCreationDate()
	 * @see #getEdition()
	 * @generated
	 */
	EAttribute getEdition_EditionCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Edition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Edition#getId()
	 * @see #getEdition()
	 * @generated
	 */
	EAttribute getEdition_Id();

	/**
	 * Returns the meta object for class '{@link lobj.FolderMeta <em>Folder Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Meta</em>'.
	 * @see lobj.FolderMeta
	 * @generated
	 */
	EClass getFolderMeta();

	/**
	 * Returns the meta object for the attribute '{@link lobj.FolderMeta#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see lobj.FolderMeta#getTitle()
	 * @see #getFolderMeta()
	 * @generated
	 */
	EAttribute getFolderMeta_Title();

	/**
	 * Returns the meta object for the attribute '{@link lobj.FolderMeta#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see lobj.FolderMeta#getDescription()
	 * @see #getFolderMeta()
	 * @generated
	 */
	EAttribute getFolderMeta_Description();

	/**
	 * Returns the meta object for the attribute '{@link lobj.FolderMeta#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see lobj.FolderMeta#getCreationDate()
	 * @see #getFolderMeta()
	 * @generated
	 */
	EAttribute getFolderMeta_CreationDate();

	/**
	 * Returns the meta object for class '{@link lobj.LuMeta <em>Lu Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lu Meta</em>'.
	 * @see lobj.LuMeta
	 * @generated
	 */
	EClass getLuMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.LuMeta#getDidacMeta <em>Didac Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Didac Meta</em>'.
	 * @see lobj.LuMeta#getDidacMeta()
	 * @see #getLuMeta()
	 * @generated
	 */
	EReference getLuMeta_DidacMeta();

	/**
	 * Returns the meta object for the attribute '{@link lobj.LuMeta#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see lobj.LuMeta#getCreationDate()
	 * @see #getLuMeta()
	 * @generated
	 */
	EAttribute getLuMeta_CreationDate();

	/**
	 * Returns the meta object for the reference '{@link lobj.LuMeta#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see lobj.LuMeta#getDomain()
	 * @see #getLuMeta()
	 * @generated
	 */
	EReference getLuMeta_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.LuMeta#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authors</em>'.
	 * @see lobj.LuMeta#getAuthors()
	 * @see #getLuMeta()
	 * @generated
	 */
	EReference getLuMeta_Authors();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.LuMeta#getPublishInfo <em>Publish Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publish Info</em>'.
	 * @see lobj.LuMeta#getPublishInfo()
	 * @see #getLuMeta()
	 * @generated
	 */
	EReference getLuMeta_PublishInfo();

	/**
	 * Returns the meta object for the reference '{@link lobj.LuMeta#getDefLang <em>Def Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def Lang</em>'.
	 * @see lobj.LuMeta#getDefLang()
	 * @see #getLuMeta()
	 * @generated
	 */
	EReference getLuMeta_DefLang();

	/**
	 * Returns the meta object for class '{@link lobj.Userauthorization <em>Userauthorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Userauthorization</em>'.
	 * @see lobj.Userauthorization
	 * @generated
	 */
	EClass getUserauthorization();

	/**
	 * Returns the meta object for the reference '{@link lobj.Userauthorization#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see lobj.Userauthorization#getUser()
	 * @see #getUserauthorization()
	 * @generated
	 */
	EReference getUserauthorization_User();

	/**
	 * Returns the meta object for the reference '{@link lobj.Userauthorization#getAuthType <em>Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Auth Type</em>'.
	 * @see lobj.Userauthorization#getAuthType()
	 * @see #getUserauthorization()
	 * @generated
	 */
	EReference getUserauthorization_AuthType();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Userauthorization#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Userauthorization#getId()
	 * @see #getUserauthorization()
	 * @generated
	 */
	EAttribute getUserauthorization_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see lobj.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Note#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see lobj.Note#getDate()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Date();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Note#getNoteAuthor <em>Note Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note Author</em>'.
	 * @see lobj.Note#getNoteAuthor()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_NoteAuthor();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Note#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see lobj.Note#getContent()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Content();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Note#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Note#getId()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see lobj.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Person#getHonorific <em>Honorific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Honorific</em>'.
	 * @see lobj.Person#getHonorific()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Honorific();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see lobj.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Person#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see lobj.Person#getSurname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Surname();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Person#getContrib <em>Contrib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrib</em>'.
	 * @see lobj.Person#getContrib()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Contrib();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Person#getAffiliations <em>Affiliations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affiliations</em>'.
	 * @see lobj.Person#getAffiliations()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Affiliations();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Person#getPersonblurb <em>Personblurb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personblurb</em>'.
	 * @see lobj.Person#getPersonblurb()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Personblurb();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Person#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Person#getId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see lobj.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Publisher#getPublishername <em>Publishername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publishername</em>'.
	 * @see lobj.Publisher#getPublishername()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Publishername();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Publisher#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see lobj.Publisher#getAddress()
	 * @see #getPublisher()
	 * @generated
	 */
	EReference getPublisher_Address();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Publisher#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Publisher#getId()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Id();

	/**
	 * Returns the meta object for class '{@link lobj.PublishInfo <em>Publish Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publish Info</em>'.
	 * @see lobj.PublishInfo
	 * @generated
	 */
	EClass getPublishInfo();

	/**
	 * Returns the meta object for the attribute '{@link lobj.PublishInfo#getEdition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition</em>'.
	 * @see lobj.PublishInfo#getEdition()
	 * @see #getPublishInfo()
	 * @generated
	 */
	EAttribute getPublishInfo_Edition();

	/**
	 * Returns the meta object for the attribute '{@link lobj.PublishInfo#getPubdate <em>Pubdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pubdate</em>'.
	 * @see lobj.PublishInfo#getPubdate()
	 * @see #getPublishInfo()
	 * @generated
	 */
	EAttribute getPublishInfo_Pubdate();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.PublishInfo#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see lobj.PublishInfo#getPublisher()
	 * @see #getPublishInfo()
	 * @generated
	 */
	EReference getPublishInfo_Publisher();

	/**
	 * Returns the meta object for the attribute '{@link lobj.PublishInfo#getPubsnumber <em>Pubsnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pubsnumber</em>'.
	 * @see lobj.PublishInfo#getPubsnumber()
	 * @see #getPublishInfo()
	 * @generated
	 */
	EAttribute getPublishInfo_Pubsnumber();

	/**
	 * Returns the meta object for the attribute '{@link lobj.PublishInfo#getReleaseinfo <em>Releaseinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Releaseinfo</em>'.
	 * @see lobj.PublishInfo#getReleaseinfo()
	 * @see #getPublishInfo()
	 * @generated
	 */
	EAttribute getPublishInfo_Releaseinfo();

	/**
	 * Returns the meta object for the attribute '{@link lobj.PublishInfo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.PublishInfo#getId()
	 * @see #getPublishInfo()
	 * @generated
	 */
	EAttribute getPublishInfo_Id();

	/**
	 * Returns the meta object for class '{@link lobj.ResrcMeta <em>Resrc Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resrc Meta</em>'.
	 * @see lobj.ResrcMeta
	 * @generated
	 */
	EClass getResrcMeta();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcMeta#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see lobj.ResrcMeta#getFilename()
	 * @see #getResrcMeta()
	 * @generated
	 */
	EAttribute getResrcMeta_Filename();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcMeta#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see lobj.ResrcMeta#getParameters()
	 * @see #getResrcMeta()
	 * @generated
	 */
	EAttribute getResrcMeta_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcMeta#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see lobj.ResrcMeta#getHeight()
	 * @see #getResrcMeta()
	 * @generated
	 */
	EAttribute getResrcMeta_Height();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcMeta#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see lobj.ResrcMeta#getWidth()
	 * @see #getResrcMeta()
	 * @generated
	 */
	EAttribute getResrcMeta_Width();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcMeta#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see lobj.ResrcMeta#getCreationDate()
	 * @see #getResrcMeta()
	 * @generated
	 */
	EAttribute getResrcMeta_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcMeta#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see lobj.ResrcMeta#getLastModified()
	 * @see #getResrcMeta()
	 * @generated
	 */
	EAttribute getResrcMeta_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcMeta#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see lobj.ResrcMeta#getTitle()
	 * @see #getResrcMeta()
	 * @generated
	 */
	EAttribute getResrcMeta_Title();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcMeta#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see lobj.ResrcMeta#getDescription()
	 * @see #getResrcMeta()
	 * @generated
	 */
	EAttribute getResrcMeta_Description();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ResrcMeta#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see lobj.ResrcMeta#getKeywords()
	 * @see #getResrcMeta()
	 * @generated
	 */
	EAttribute getResrcMeta_Keywords();

	/**
	 * Returns the meta object for class '{@link lobj.Sharednotes <em>Sharednotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sharednotes</em>'.
	 * @see lobj.Sharednotes
	 * @generated
	 */
	EClass getSharednotes();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Sharednotes#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see lobj.Sharednotes#getNotes()
	 * @see #getSharednotes()
	 * @generated
	 */
	EReference getSharednotes_Notes();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Sharednotes#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Sharednotes#getId()
	 * @see #getSharednotes()
	 * @generated
	 */
	EAttribute getSharednotes_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Coursetype <em>Coursetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coursetype</em>'.
	 * @see lobj.Coursetype
	 * @generated
	 */
	EClass getCoursetype();

	/**
	 * Returns the meta object for the reference '{@link lobj.Coursetype#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see lobj.Coursetype#getLanguage()
	 * @see #getCoursetype()
	 * @generated
	 */
	EReference getCoursetype_Language();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Coursetype#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see lobj.Coursetype#getTitle()
	 * @see #getCoursetype()
	 * @generated
	 */
	EAttribute getCoursetype_Title();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Coursetype#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see lobj.Coursetype#getDescription()
	 * @see #getCoursetype()
	 * @generated
	 */
	EAttribute getCoursetype_Description();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Coursetype#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Coursetype#getId()
	 * @see #getCoursetype()
	 * @generated
	 */
	EAttribute getCoursetype_Id();

	/**
	 * Returns the meta object for class '{@link lobj.ExternalMetadata <em>External Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Metadata</em>'.
	 * @see lobj.ExternalMetadata
	 * @generated
	 */
	EClass getExternalMetadata();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ExternalMetadata#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see lobj.ExternalMetadata#getRef()
	 * @see #getExternalMetadata()
	 * @generated
	 */
	EAttribute getExternalMetadata_Ref();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ExternalMetadata#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see lobj.ExternalMetadata#getFile()
	 * @see #getExternalMetadata()
	 * @generated
	 */
	EAttribute getExternalMetadata_File();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ExternalMetadata#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.ExternalMetadata#getId()
	 * @see #getExternalMetadata()
	 * @generated
	 */
	EAttribute getExternalMetadata_Id();

	/**
	 * Returns the meta object for class '{@link lobj.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see lobj.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Language#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see lobj.Language#getLanguage()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Language();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Language#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see lobj.Language#getCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_Code();

	/**
	 * Returns the meta object for class '{@link lobj.Precognition <em>Precognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precognition</em>'.
	 * @see lobj.Precognition
	 * @generated
	 */
	EClass getPrecognition();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Precognition#getPrecog <em>Precog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precog</em>'.
	 * @see lobj.Precognition#getPrecog()
	 * @see #getPrecognition()
	 * @generated
	 */
	EAttribute getPrecognition_Precog();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.Precognition#getInternalRefs <em>Internal Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Refs</em>'.
	 * @see lobj.Precognition#getInternalRefs()
	 * @see #getPrecognition()
	 * @generated
	 */
	EReference getPrecognition_InternalRefs();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Precognition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Precognition#getId()
	 * @see #getPrecognition()
	 * @generated
	 */
	EAttribute getPrecognition_Id();

	/**
	 * Returns the meta object for class '{@link lobj.InternalRef <em>Internal Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Ref</em>'.
	 * @see lobj.InternalRef
	 * @generated
	 */
	EClass getInternalRef();

	/**
	 * Returns the meta object for the reference '{@link lobj.InternalRef#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see lobj.InternalRef#getLanguage()
	 * @see #getInternalRef()
	 * @generated
	 */
	EReference getInternalRef_Language();

	/**
	 * Returns the meta object for the attribute '{@link lobj.InternalRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see lobj.InternalRef#getRef()
	 * @see #getInternalRef()
	 * @generated
	 */
	EAttribute getInternalRef_Ref();

	/**
	 * Returns the meta object for the attribute '{@link lobj.InternalRef#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see lobj.InternalRef#getFile()
	 * @see #getInternalRef()
	 * @generated
	 */
	EAttribute getInternalRef_File();

	/**
	 * Returns the meta object for the attribute '{@link lobj.InternalRef#getReftype <em>Reftype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reftype</em>'.
	 * @see lobj.InternalRef#getReftype()
	 * @see #getInternalRef()
	 * @generated
	 */
	EAttribute getInternalRef_Reftype();

	/**
	 * Returns the meta object for the attribute '{@link lobj.InternalRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.InternalRef#getId()
	 * @see #getInternalRef()
	 * @generated
	 */
	EAttribute getInternalRef_Id();

	/**
	 * Returns the meta object for class '{@link lobj.ModuleMeta <em>Module Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Meta</em>'.
	 * @see lobj.ModuleMeta
	 * @generated
	 */
	EClass getModuleMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.ModuleMeta#getDidacMeta <em>Didac Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Didac Meta</em>'.
	 * @see lobj.ModuleMeta#getDidacMeta()
	 * @see #getModuleMeta()
	 * @generated
	 */
	EReference getModuleMeta_DidacMeta();

	/**
	 * Returns the meta object for the attribute '{@link lobj.ModuleMeta#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see lobj.ModuleMeta#getCreationDate()
	 * @see #getModuleMeta()
	 * @generated
	 */
	EAttribute getModuleMeta_CreationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link lobj.ModuleMeta#getAuthors <em>Authors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authors</em>'.
	 * @see lobj.ModuleMeta#getAuthors()
	 * @see #getModuleMeta()
	 * @generated
	 */
	EReference getModuleMeta_Authors();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.ModuleMeta#getPublishInfo <em>Publish Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publish Info</em>'.
	 * @see lobj.ModuleMeta#getPublishInfo()
	 * @see #getModuleMeta()
	 * @generated
	 */
	EReference getModuleMeta_PublishInfo();

	/**
	 * Returns the meta object for the reference '{@link lobj.ModuleMeta#getDefLang <em>Def Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def Lang</em>'.
	 * @see lobj.ModuleMeta#getDefLang()
	 * @see #getModuleMeta()
	 * @generated
	 */
	EReference getModuleMeta_DefLang();

	/**
	 * Returns the meta object for class '{@link lobj.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see lobj.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the containment reference '{@link lobj.Source#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see lobj.Source#getAuthor()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Author();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Source#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see lobj.Source#getTitle()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Title();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Source#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see lobj.Source#getSubtitle()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Subtitle();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Source#getPublishedIn <em>Published In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published In</em>'.
	 * @see lobj.Source#getPublishedIn()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_PublishedIn();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Source#getPublishedBy <em>Published By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published By</em>'.
	 * @see lobj.Source#getPublishedBy()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_PublishedBy();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Source#getPublishDate <em>Publish Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publish Date</em>'.
	 * @see lobj.Source#getPublishDate()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_PublishDate();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Source#getPp <em>Pp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pp</em>'.
	 * @see lobj.Source#getPp()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Pp();

	/**
	 * Returns the meta object for the attribute '{@link lobj.Source#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.Source#getId()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Id();

	/**
	 * Returns the meta object for class '{@link lobj.AuthorizationTypes <em>Authorization Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Types</em>'.
	 * @see lobj.AuthorizationTypes
	 * @generated
	 */
	EClass getAuthorizationTypes();

	/**
	 * Returns the meta object for the attribute '{@link lobj.AuthorizationTypes#getAuthType <em>Auth Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Type</em>'.
	 * @see lobj.AuthorizationTypes#getAuthType()
	 * @see #getAuthorizationTypes()
	 * @generated
	 */
	EAttribute getAuthorizationTypes_AuthType();

	/**
	 * Returns the meta object for the attribute '{@link lobj.AuthorizationTypes#getAuthTypeDesc <em>Auth Type Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Type Desc</em>'.
	 * @see lobj.AuthorizationTypes#getAuthTypeDesc()
	 * @see #getAuthorizationTypes()
	 * @generated
	 */
	EAttribute getAuthorizationTypes_AuthTypeDesc();

	/**
	 * Returns the meta object for the attribute '{@link lobj.AuthorizationTypes#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see lobj.AuthorizationTypes#isReadOnly()
	 * @see #getAuthorizationTypes()
	 * @generated
	 */
	EAttribute getAuthorizationTypes_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link lobj.AuthorizationTypes#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.AuthorizationTypes#getId()
	 * @see #getAuthorizationTypes()
	 * @generated
	 */
	EAttribute getAuthorizationTypes_Id();

	/**
	 * Returns the meta object for class '{@link lobj.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see lobj.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getLoginname <em>Loginname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loginname</em>'.
	 * @see lobj.User#getLoginname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Loginname();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see lobj.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see lobj.User#getFirstname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see lobj.User#getLastname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getMatriculationnr <em>Matriculationnr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matriculationnr</em>'.
	 * @see lobj.User#getMatriculationnr()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Matriculationnr();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getScn <em>Scn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scn</em>'.
	 * @see lobj.User#getScn()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Scn();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getIcqnumber <em>Icqnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icqnumber</em>'.
	 * @see lobj.User#getIcqnumber()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Icqnumber();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getIcqpassword <em>Icqpassword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icqpassword</em>'.
	 * @see lobj.User#getIcqpassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Icqpassword();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getEntryasxml <em>Entryasxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entryasxml</em>'.
	 * @see lobj.User#getEntryasxml()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Entryasxml();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getLanguagenr <em>Languagenr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Languagenr</em>'.
	 * @see lobj.User#getLanguagenr()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Languagenr();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getNotificationprofileasxml <em>Notificationprofileasxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notificationprofileasxml</em>'.
	 * @see lobj.User#getNotificationprofileasxml()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Notificationprofileasxml();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getDossierasxml <em>Dossierasxml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dossierasxml</em>'.
	 * @see lobj.User#getDossierasxml()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Dossierasxml();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getPhoto <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Photo</em>'.
	 * @see lobj.User#getPhoto()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Photo();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getOnlinestatus <em>Onlinestatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onlinestatus</em>'.
	 * @see lobj.User#getOnlinestatus()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Onlinestatus();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getOnlinedate <em>Onlinedate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onlinedate</em>'.
	 * @see lobj.User#getOnlinedate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Onlinedate();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getDatafilter <em>Datafilter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datafilter</em>'.
	 * @see lobj.User#getDatafilter()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Datafilter();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getInchatsince <em>Inchatsince</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inchatsince</em>'.
	 * @see lobj.User#getInchatsince()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Inchatsince();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getContchatdate <em>Contchatdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contchatdate</em>'.
	 * @see lobj.User#getContchatdate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Contchatdate();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getChatroomnr <em>Chatroomnr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chatroomnr</em>'.
	 * @see lobj.User#getChatroomnr()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Chatroomnr();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getFromext <em>Fromext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fromext</em>'.
	 * @see lobj.User#getFromext()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Fromext();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getLastlogindate <em>Lastlogindate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastlogindate</em>'.
	 * @see lobj.User#getLastlogindate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Lastlogindate();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getCurrlogindate <em>Currlogindate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currlogindate</em>'.
	 * @see lobj.User#getCurrlogindate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Currlogindate();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getLastcoursematerialnr <em>Lastcoursematerialnr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastcoursematerialnr</em>'.
	 * @see lobj.User#getLastcoursematerialnr()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Lastcoursematerialnr();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getLastcoursematerialviewnr <em>Lastcoursematerialviewnr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastcoursematerialviewnr</em>'.
	 * @see lobj.User#getLastcoursematerialviewnr()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Lastcoursematerialviewnr();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getAuthenticateldap <em>Authenticateldap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authenticateldap</em>'.
	 * @see lobj.User#getAuthenticateldap()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Authenticateldap();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getPhotochanged <em>Photochanged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Photochanged</em>'.
	 * @see lobj.User#getPhotochanged()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Photochanged();

	/**
	 * Returns the meta object for the reference list '{@link lobj.User#getAuthorizations <em>Authorizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Authorizations</em>'.
	 * @see lobj.User#getAuthorizations()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Authorizations();

	/**
	 * Returns the meta object for the attribute '{@link lobj.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lobj.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LobjFactory getLobjFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lobj.impl.LearningObjectImpl <em>Learning Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.LearningObjectImpl
		 * @see lobj.impl.LobjPackageImpl#getLearningObject()
		 * @generated
		 */
		EClass LEARNING_OBJECT = eINSTANCE.getLearningObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_OBJECT__ID = eINSTANCE.getLearningObject_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_OBJECT__TIMESTAMP = eINSTANCE.getLearningObject_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_OBJECT__SYNCHRONIZED = eINSTANCE.getLearningObject_Synchronized();

		/**
		 * The meta object literal for the '{@link lobj.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.BlockImpl
		 * @see lobj.impl.LobjPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Block Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BLOCK_META = eINSTANCE.getBlock_BlockMeta();

		/**
		 * The meta object literal for the '<em><b>External Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__EXTERNAL_METADATA = eINSTANCE.getBlock_ExternalMetadata();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ACCESS_CONTROL = eINSTANCE.getBlock_AccessControl();

		/**
		 * The meta object literal for the '{@link lobj.impl.HypertextBlockImpl <em>Hypertext Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.HypertextBlockImpl
		 * @see lobj.impl.LobjPackageImpl#getHypertextBlock()
		 * @generated
		 */
		EClass HYPERTEXT_BLOCK = eINSTANCE.getHypertextBlock();

		/**
		 * The meta object literal for the '<em><b>Hypertext Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERTEXT_BLOCK__HYPERTEXT_CONTENT = eINSTANCE.getHypertextBlock_HypertextContent();

		/**
		 * The meta object literal for the '{@link lobj.impl.AbstractContentImpl <em>Abstract Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.AbstractContentImpl
		 * @see lobj.impl.LobjPackageImpl#getAbstractContent()
		 * @generated
		 */
		EClass ABSTRACT_CONTENT = eINSTANCE.getAbstractContent();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONTENT__HEADING = eINSTANCE.getAbstractContent_Heading();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTENT__LANGUAGE = eINSTANCE.getAbstractContent_Language();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTENT__SOURCE = eINSTANCE.getAbstractContent_Source();

		/**
		 * The meta object literal for the '{@link lobj.impl.HypertextContentImpl <em>Hypertext Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.HypertextContentImpl
		 * @see lobj.impl.LobjPackageImpl#getHypertextContent()
		 * @generated
		 */
		EClass HYPERTEXT_CONTENT = eINSTANCE.getHypertextContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPERTEXT_CONTENT__CONTENT = eINSTANCE.getHypertextContent_Content();

		/**
		 * The meta object literal for the '<em><b>Block Audiofile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERTEXT_CONTENT__BLOCK_AUDIOFILE = eINSTANCE.getHypertextContent_BlockAudiofile();

		/**
		 * The meta object literal for the '<em><b>Resrc File</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HYPERTEXT_CONTENT__RESRC_FILE = eINSTANCE.getHypertextContent_ResrcFile();

		/**
		 * The meta object literal for the '{@link lobj.impl.BlockFolderImpl <em>Block Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.BlockFolderImpl
		 * @see lobj.impl.LobjPackageImpl#getBlockFolder()
		 * @generated
		 */
		EClass BLOCK_FOLDER = eINSTANCE.getBlockFolder();

		/**
		 * The meta object literal for the '<em><b>Folder Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_FOLDER__FOLDER_META = eINSTANCE.getBlockFolder_FolderMeta();

		/**
		 * The meta object literal for the '<em><b>Block Folder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_FOLDER__BLOCK_FOLDER = eINSTANCE.getBlockFolder_BlockFolder();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_FOLDER__BLOCK = eINSTANCE.getBlockFolder_Block();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_FOLDER__ACCESS_CONTROL = eINSTANCE.getBlockFolder_AccessControl();

		/**
		 * The meta object literal for the '{@link lobj.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.CategoryImpl
		 * @see lobj.impl.LobjPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Title Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__TITLE_META = eINSTANCE.getCategory_TitleMeta();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__COURSE = eINSTANCE.getCategory_Course();

		/**
		 * The meta object literal for the '{@link lobj.impl.CorrBlockImpl <em>Corr Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.CorrBlockImpl
		 * @see lobj.impl.LobjPackageImpl#getCorrBlock()
		 * @generated
		 */
		EClass CORR_BLOCK = eINSTANCE.getCorrBlock();

		/**
		 * The meta object literal for the '<em><b>Presentation Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORR_BLOCK__PRESENTATION_BLOCK = eINSTANCE.getCorrBlock_PresentationBlock();

		/**
		 * The meta object literal for the '<em><b>Title Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORR_BLOCK__TITLE_META = eINSTANCE.getCorrBlock_TitleMeta();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORR_BLOCK__ID = eINSTANCE.getCorrBlock_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.CourseImpl
		 * @see lobj.impl.LobjPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSE_META = eINSTANCE.getCourse_CourseMeta();

		/**
		 * The meta object literal for the '<em><b>External Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__EXTERNAL_METADATA = eINSTANCE.getCourse_ExternalMetadata();

		/**
		 * The meta object literal for the '<em><b>Coursetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSETYPE = eINSTANCE.getCourse_Coursetype();

		/**
		 * The meta object literal for the '<em><b>Outline As Xml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__OUTLINE_AS_XML = eINSTANCE.getCourse_OutlineAsXml();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__MODULE = eINSTANCE.getCourse_Module();

		/**
		 * The meta object literal for the '{@link lobj.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ItemImpl
		 * @see lobj.impl.LobjPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Corr Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__CORR_BLOCK = eINSTANCE.getItem_CorrBlock();

		/**
		 * The meta object literal for the '<em><b>Childitems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__CHILDITEMS = eINSTANCE.getItem_Childitems();

		/**
		 * The meta object literal for the '<em><b>Lu Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__LU_REF = eINSTANCE.getItem_LuRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ID = eINSTANCE.getItem_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.LearningUnitImpl <em>Learning Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.LearningUnitImpl
		 * @see lobj.impl.LobjPackageImpl#getLearningUnit()
		 * @generated
		 */
		EClass LEARNING_UNIT = eINSTANCE.getLearningUnit();

		/**
		 * The meta object literal for the '<em><b>Lu Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_UNIT__LU_META = eINSTANCE.getLearningUnit_LuMeta();

		/**
		 * The meta object literal for the '<em><b>External Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_UNIT__EXTERNAL_METADATA = eINSTANCE.getLearningUnit_ExternalMetadata();

		/**
		 * The meta object literal for the '<em><b>Tree As Xml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_UNIT__TREE_AS_XML = eINSTANCE.getLearningUnit_TreeAsXml();

		/**
		 * The meta object literal for the '<em><b>Lu File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEARNING_UNIT__LU_FILE = eINSTANCE.getLearningUnit_LuFile();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_UNIT__ACCESS_CONTROL = eINSTANCE.getLearningUnit_AccessControl();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEARNING_UNIT__ITEM = eINSTANCE.getLearningUnit_Item();

		/**
		 * The meta object literal for the '{@link lobj.impl.LuFolderImpl <em>Lu Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.LuFolderImpl
		 * @see lobj.impl.LobjPackageImpl#getLuFolder()
		 * @generated
		 */
		EClass LU_FOLDER = eINSTANCE.getLuFolder();

		/**
		 * The meta object literal for the '<em><b>Folder Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LU_FOLDER__FOLDER_META = eINSTANCE.getLuFolder_FolderMeta();

		/**
		 * The meta object literal for the '<em><b>Lu Folder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LU_FOLDER__LU_FOLDER = eINSTANCE.getLuFolder_LuFolder();

		/**
		 * The meta object literal for the '<em><b>Learning Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LU_FOLDER__LEARNING_UNIT = eINSTANCE.getLuFolder_LearningUnit();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LU_FOLDER__ACCESS_CONTROL = eINSTANCE.getLuFolder_AccessControl();

		/**
		 * The meta object literal for the '{@link lobj.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ModuleImpl
		 * @see lobj.impl.LobjPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Module Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULE_META = eINSTANCE.getModule_ModuleMeta();

		/**
		 * The meta object literal for the '<em><b>External Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__EXTERNAL_METADATA = eINSTANCE.getModule_ExternalMetadata();

		/**
		 * The meta object literal for the '<em><b>Root Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ROOT_NODE = eINSTANCE.getModule_RootNode();

		/**
		 * The meta object literal for the '<em><b>Module File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__MODULE_FILE = eINSTANCE.getModule_ModuleFile();

		/**
		 * The meta object literal for the '<em><b>Tree As Xml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__TREE_AS_XML = eINSTANCE.getModule_TreeAsXml();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ACCESS_CONTROL = eINSTANCE.getModule_AccessControl();

		/**
		 * The meta object literal for the '{@link lobj.impl.ModuleFolderImpl <em>Module Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ModuleFolderImpl
		 * @see lobj.impl.LobjPackageImpl#getModuleFolder()
		 * @generated
		 */
		EClass MODULE_FOLDER = eINSTANCE.getModuleFolder();

		/**
		 * The meta object literal for the '<em><b>Folder Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_FOLDER__FOLDER_META = eINSTANCE.getModuleFolder_FolderMeta();

		/**
		 * The meta object literal for the '<em><b>Module Folder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_FOLDER__MODULE_FOLDER = eINSTANCE.getModuleFolder_ModuleFolder();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_FOLDER__MODULE = eINSTANCE.getModuleFolder_Module();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_FOLDER__ACCESS_CONTROL = eINSTANCE.getModuleFolder_AccessControl();

		/**
		 * The meta object literal for the '{@link lobj.impl.ResrcFolderImpl <em>Resrc Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ResrcFolderImpl
		 * @see lobj.impl.LobjPackageImpl#getResrcFolder()
		 * @generated
		 */
		EClass RESRC_FOLDER = eINSTANCE.getResrcFolder();

		/**
		 * The meta object literal for the '<em><b>Folder Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESRC_FOLDER__FOLDER_META = eINSTANCE.getResrcFolder_FolderMeta();

		/**
		 * The meta object literal for the '<em><b>Resrc Folder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESRC_FOLDER__RESRC_FOLDER = eINSTANCE.getResrcFolder_ResrcFolder();

		/**
		 * The meta object literal for the '<em><b>Access Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESRC_FOLDER__ACCESS_CONTROL = eINSTANCE.getResrcFolder_AccessControl();

		/**
		 * The meta object literal for the '<em><b>Delete Scheduled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FOLDER__DELETE_SCHEDULED = eINSTANCE.getResrcFolder_DeleteScheduled();

		/**
		 * The meta object literal for the '<em><b>Resrc File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESRC_FOLDER__RESRC_FILE = eINSTANCE.getResrcFolder_ResrcFile();

		/**
		 * The meta object literal for the '{@link lobj.impl.ThemeImpl <em>Theme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ThemeImpl
		 * @see lobj.impl.LobjPackageImpl#getTheme()
		 * @generated
		 */
		EClass THEME = eINSTANCE.getTheme();

		/**
		 * The meta object literal for the '<em><b>Simple Didac Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEME__SIMPLE_DIDAC_META = eINSTANCE.getTheme_SimpleDidacMeta();

		/**
		 * The meta object literal for the '{@link lobj.impl.PresentationBlockImpl <em>Presentation Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.PresentationBlockImpl
		 * @see lobj.impl.LobjPackageImpl#getPresentationBlock()
		 * @generated
		 */
		EClass PRESENTATION_BLOCK = eINSTANCE.getPresentationBlock();

		/**
		 * The meta object literal for the '<em><b>Lod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_BLOCK__LOD = eINSTANCE.getPresentationBlock_Lod();

		/**
		 * The meta object literal for the '<em><b>Rendering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_BLOCK__RENDERING = eINSTANCE.getPresentationBlock_Rendering();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION_BLOCK__BLOCK = eINSTANCE.getPresentationBlock_Block();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION_BLOCK__ID = eINSTANCE.getPresentationBlock_Id();

		/**
		 * The meta object literal for the '{@link lobj.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.Node
		 * @see lobj.impl.LobjPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__VISIBLE = eINSTANCE.getNode_Visible();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.ThemeNodeImpl <em>Theme Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ThemeNodeImpl
		 * @see lobj.impl.LobjPackageImpl#getThemeNode()
		 * @generated
		 */
		EClass THEME_NODE = eINSTANCE.getThemeNode();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEME_NODE__THEME = eINSTANCE.getThemeNode_Theme();

		/**
		 * The meta object literal for the '<em><b>Childnodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEME_NODE__CHILDNODES = eINSTANCE.getThemeNode_Childnodes();

		/**
		 * The meta object literal for the '{@link lobj.impl.LuNodeImpl <em>Lu Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.LuNodeImpl
		 * @see lobj.impl.LobjPackageImpl#getLuNode()
		 * @generated
		 */
		EClass LU_NODE = eINSTANCE.getLuNode();

		/**
		 * The meta object literal for the '<em><b>Learning Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LU_NODE__LEARNING_UNIT = eINSTANCE.getLuNode_LearningUnit();

		/**
		 * The meta object literal for the '{@link lobj.impl.ResrcFileImpl <em>Resrc File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ResrcFileImpl
		 * @see lobj.impl.LobjPackageImpl#getResrcFile()
		 * @generated
		 */
		EClass RESRC_FILE = eINSTANCE.getResrcFile();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILE__FILE = eINSTANCE.getResrcFile_File();

		/**
		 * The meta object literal for the '<em><b>File tn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILE__FILE_TN = eINSTANCE.getResrcFile_File_tn();

		/**
		 * The meta object literal for the '<em><b>Originalextension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILE__ORIGINALEXTENSION = eINSTANCE.getResrcFile_Originalextension();

		/**
		 * The meta object literal for the '<em><b>Filesize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILE__FILESIZE = eINSTANCE.getResrcFile_Filesize();

		/**
		 * The meta object literal for the '<em><b>Resrc Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILE__RESRC_HREF = eINSTANCE.getResrcFile_ResrcHref();

		/**
		 * The meta object literal for the '<em><b>Accesscontrol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESRC_FILE__ACCESSCONTROL = eINSTANCE.getResrcFile_Accesscontrol();

		/**
		 * The meta object literal for the '<em><b>Resrc Filetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESRC_FILE__RESRC_FILETYPE = eINSTANCE.getResrcFile_ResrcFiletype();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESRC_FILE__SOURCE = eINSTANCE.getResrcFile_Source();

		/**
		 * The meta object literal for the '<em><b>Hypertext Content</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESRC_FILE__HYPERTEXT_CONTENT = eINSTANCE.getResrcFile_HypertextContent();

		/**
		 * The meta object literal for the '<em><b>Resrc Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESRC_FILE__RESRC_META = eINSTANCE.getResrcFile_ResrcMeta();

		/**
		 * The meta object literal for the '{@link lobj.impl.BlockAudiofileImpl <em>Block Audiofile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.BlockAudiofileImpl
		 * @see lobj.impl.LobjPackageImpl#getBlockAudiofile()
		 * @generated
		 */
		EClass BLOCK_AUDIOFILE = eINSTANCE.getBlockAudiofile();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_AUDIOFILE__FILE = eINSTANCE.getBlockAudiofile_File();

		/**
		 * The meta object literal for the '<em><b>Originalextension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_AUDIOFILE__ORIGINALEXTENSION = eINSTANCE.getBlockAudiofile_Originalextension();

		/**
		 * The meta object literal for the '<em><b>Filesize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_AUDIOFILE__FILESIZE = eINSTANCE.getBlockAudiofile_Filesize();

		/**
		 * The meta object literal for the '<em><b>Resrc Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_AUDIOFILE__RESRC_HREF = eINSTANCE.getBlockAudiofile_ResrcHref();

		/**
		 * The meta object literal for the '<em><b>Resrc Filetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_AUDIOFILE__RESRC_FILETYPE = eINSTANCE.getBlockAudiofile_ResrcFiletype();

		/**
		 * The meta object literal for the '{@link lobj.impl.ResrcFiletypeImpl <em>Resrc Filetype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ResrcFiletypeImpl
		 * @see lobj.impl.LobjPackageImpl#getResrcFiletype()
		 * @generated
		 */
		EClass RESRC_FILETYPE = eINSTANCE.getResrcFiletype();

		/**
		 * The meta object literal for the '<em><b>Filetype Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILETYPE__FILETYPE_EXTENSION = eINSTANCE.getResrcFiletype_FiletypeExtension();

		/**
		 * The meta object literal for the '<em><b>Filetype Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILETYPE__FILETYPE_DESC = eINSTANCE.getResrcFiletype_FiletypeDesc();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILETYPE__IMAGE = eINSTANCE.getResrcFiletype_Image();

		/**
		 * The meta object literal for the '<em><b>Applet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILETYPE__APPLET = eINSTANCE.getResrcFiletype_Applet();

		/**
		 * The meta object literal for the '<em><b>Filetype Image Small</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILETYPE__FILETYPE_IMAGE_SMALL = eINSTANCE.getResrcFiletype_FiletypeImageSmall();

		/**
		 * The meta object literal for the '<em><b>Filetype Image Bif</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILETYPE__FILETYPE_IMAGE_BIF = eINSTANCE.getResrcFiletype_FiletypeImageBif();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_FILETYPE__ID = eINSTANCE.getResrcFiletype_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.AccessControlImpl <em>Access Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.AccessControlImpl
		 * @see lobj.impl.LobjPackageImpl#getAccessControl()
		 * @generated
		 */
		EClass ACCESS_CONTROL = eINSTANCE.getAccessControl();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL__OWNER = eINSTANCE.getAccessControl_Owner();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL__LAST_MODIFIED = eINSTANCE.getAccessControl_LastModified();

		/**
		 * The meta object literal for the '<em><b>Last Modified By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL__LAST_MODIFIED_BY = eINSTANCE.getAccessControl_LastModifiedBy();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL__STATUS = eINSTANCE.getAccessControl_Status();

		/**
		 * The meta object literal for the '<em><b>Last Status Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL__LAST_STATUS_CHANGE = eINSTANCE.getAccessControl_LastStatusChange();

		/**
		 * The meta object literal for the '<em><b>Last Status Change By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL__LAST_STATUS_CHANGE_BY = eINSTANCE.getAccessControl_LastStatusChangeBy();

		/**
		 * The meta object literal for the '<em><b>Sharednotes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL__SHAREDNOTES = eINSTANCE.getAccessControl_Sharednotes();

		/**
		 * The meta object literal for the '<em><b>Authorizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL__AUTHORIZES = eINSTANCE.getAccessControl_Authorizes();

		/**
		 * The meta object literal for the '<em><b>Edition History</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL__EDITION_HISTORY = eINSTANCE.getAccessControl_EditionHistory();

		/**
		 * The meta object literal for the '<em><b>Global Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL__GLOBAL_ACCESS = eINSTANCE.getAccessControl_GlobalAccess();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CONTROL__ID = eINSTANCE.getAccessControl_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.AddressImpl
		 * @see lobj.impl.LobjPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>Postcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__POSTCODE = eINSTANCE.getAddress_Postcode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STATE = eINSTANCE.getAddress_State();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__PHONE = eINSTANCE.getAddress_Phone();

		/**
		 * The meta object literal for the '<em><b>Fax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__FAX = eINSTANCE.getAddress_Fax();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__EMAIL = eINSTANCE.getAddress_Email();

		/**
		 * The meta object literal for the '<em><b>Otheraddr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__OTHERADDR = eINSTANCE.getAddress_Otheraddr();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ID = eINSTANCE.getAddress_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.AffiliationImpl <em>Affiliation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.AffiliationImpl
		 * @see lobj.impl.LobjPackageImpl#getAffiliation()
		 * @generated
		 */
		EClass AFFILIATION = eINSTANCE.getAffiliation();

		/**
		 * The meta object literal for the '<em><b>Shortaffil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION__SHORTAFFIL = eINSTANCE.getAffiliation_Shortaffil();

		/**
		 * The meta object literal for the '<em><b>Jobtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION__JOBTITLE = eINSTANCE.getAffiliation_Jobtitle();

		/**
		 * The meta object literal for the '<em><b>Orgname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION__ORGNAME = eINSTANCE.getAffiliation_Orgname();

		/**
		 * The meta object literal for the '<em><b>Orgdiv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION__ORGDIV = eINSTANCE.getAffiliation_Orgdiv();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFILIATION__ADDRESS = eINSTANCE.getAffiliation_Address();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATION__ID = eINSTANCE.getAffiliation_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.AuthorImpl
		 * @see lobj.impl.LobjPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Credittype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__CREDITTYPE = eINSTANCE.getAuthor_Credittype();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHOR__PERSON = eINSTANCE.getAuthor_Person();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHOR__ADDRESS = eINSTANCE.getAuthor_Address();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__EMAIL = eINSTANCE.getAuthor_Email();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__ID = eINSTANCE.getAuthor_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.BlockMetaImpl <em>Block Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.BlockMetaImpl
		 * @see lobj.impl.LobjPackageImpl#getBlockMeta()
		 * @generated
		 */
		EClass BLOCK_META = eINSTANCE.getBlockMeta();

		/**
		 * The meta object literal for the '<em><b>Lod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_META__LOD = eINSTANCE.getBlockMeta_Lod();

		/**
		 * The meta object literal for the '<em><b>Rendering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_META__RENDERING = eINSTANCE.getBlockMeta_Rendering();

		/**
		 * The meta object literal for the '<em><b>Blocktype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_META__BLOCKTYPE = eINSTANCE.getBlockMeta_Blocktype();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_META__CREATION_DATE = eINSTANCE.getBlockMeta_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_META__LAST_MODIFIED = eINSTANCE.getBlockMeta_LastModified();

		/**
		 * The meta object literal for the '<em><b>Simple Didac Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_META__SIMPLE_DIDAC_META = eINSTANCE.getBlockMeta_SimpleDidacMeta();

		/**
		 * The meta object literal for the '<em><b>Def Lang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_META__DEF_LANG = eINSTANCE.getBlockMeta_DefLang();

		/**
		 * The meta object literal for the '{@link lobj.impl.BlocktypeImpl <em>Blocktype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.BlocktypeImpl
		 * @see lobj.impl.LobjPackageImpl#getBlocktype()
		 * @generated
		 */
		EClass BLOCKTYPE = eINSTANCE.getBlocktype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKTYPE__NAME = eINSTANCE.getBlocktype_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKTYPE__DESCRIPTION = eINSTANCE.getBlocktype_Description();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKTYPE__CREATION_DATE = eINSTANCE.getBlocktype_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Style Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKTYPE__STYLE_REF = eINSTANCE.getBlocktype_StyleRef();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKTYPE__DOMAINS = eINSTANCE.getBlocktype_Domains();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKTYPE__ID = eINSTANCE.getBlocktype_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.TitleMetaImpl <em>Title Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.TitleMetaImpl
		 * @see lobj.impl.LobjPackageImpl#getTitleMeta()
		 * @generated
		 */
		EClass TITLE_META = eINSTANCE.getTitleMeta();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE_META__LANGUAGE = eINSTANCE.getTitleMeta_Language();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_META__TITLE = eINSTANCE.getTitleMeta_Title();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_META__ID = eINSTANCE.getTitleMeta_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.CourseMetaImpl <em>Course Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.CourseMetaImpl
		 * @see lobj.impl.LobjPackageImpl#getCourseMeta()
		 * @generated
		 */
		EClass COURSE_META = eINSTANCE.getCourseMeta();

		/**
		 * The meta object literal for the '<em><b>Didac Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_META__DIDAC_META = eINSTANCE.getCourseMeta_DidacMeta();

		/**
		 * The meta object literal for the '<em><b>Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_META__HOURS = eINSTANCE.getCourseMeta_Hours();

		/**
		 * The meta object literal for the '<em><b>Lvanr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_META__LVANR = eINSTANCE.getCourseMeta_Lvanr();

		/**
		 * The meta object literal for the '<em><b>Columnfilterasxml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_META__COLUMNFILTERASXML = eINSTANCE.getCourseMeta_Columnfilterasxml();

		/**
		 * The meta object literal for the '<em><b>Fromext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_META__FROMEXT = eINSTANCE.getCourseMeta_Fromext();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_META__CREATION_DATE = eINSTANCE.getCourseMeta_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Lecturer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_META__LECTURER = eINSTANCE.getCourseMeta_Lecturer();

		/**
		 * The meta object literal for the '<em><b>Def Lang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_META__DEF_LANG = eINSTANCE.getCourseMeta_DefLang();

		/**
		 * The meta object literal for the '{@link lobj.impl.SimpleDidacMetaImpl <em>Simple Didac Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.SimpleDidacMetaImpl
		 * @see lobj.impl.LobjPackageImpl#getSimpleDidacMeta()
		 * @generated
		 */
		EClass SIMPLE_DIDAC_META = eINSTANCE.getSimpleDidacMeta();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_DIDAC_META__LANGUAGE = eINSTANCE.getSimpleDidacMeta_Language();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DIDAC_META__TITLE = eINSTANCE.getSimpleDidacMeta_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DIDAC_META__DESCRIPTION = eINSTANCE.getSimpleDidacMeta_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DIDAC_META__KEYWORDS = eINSTANCE.getSimpleDidacMeta_Keywords();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DIDAC_META__ID = eINSTANCE.getSimpleDidacMeta_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.DidacMetaImpl <em>Didac Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.DidacMetaImpl
		 * @see lobj.impl.LobjPackageImpl#getDidacMeta()
		 * @generated
		 */
		EClass DIDAC_META = eINSTANCE.getDidacMeta();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIDAC_META__GOAL = eINSTANCE.getDidacMeta_Goal();

		/**
		 * The meta object literal for the '<em><b>Precognition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIDAC_META__PRECOGNITION = eINSTANCE.getDidacMeta_Precognition();

		/**
		 * The meta object literal for the '{@link lobj.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.DomainImpl
		 * @see lobj.impl.LobjPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__DESCRIPTION = eINSTANCE.getDomain_Description();

		/**
		 * The meta object literal for the '<em><b>Blocktypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__BLOCKTYPES = eINSTANCE.getDomain_Blocktypes();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__CREATION_DATE = eINSTANCE.getDomain_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Server URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__SERVER_URL = eINSTANCE.getDomain_ServerURL();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__ID = eINSTANCE.getDomain_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.EditionImpl <em>Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.EditionImpl
		 * @see lobj.impl.LobjPackageImpl#getEdition()
		 * @generated
		 */
		EClass EDITION = eINSTANCE.getEdition();

		/**
		 * The meta object literal for the '<em><b>Edition Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITION__EDITION_NR = eINSTANCE.getEdition_EditionNr();

		/**
		 * The meta object literal for the '<em><b>Edited By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITION__EDITED_BY = eINSTANCE.getEdition_EditedBy();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITION__VERSION = eINSTANCE.getEdition_Version();

		/**
		 * The meta object literal for the '<em><b>Last Version Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITION__LAST_VERSION_NUMBER = eINSTANCE.getEdition_LastVersionNumber();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITION__STATUS = eINSTANCE.getEdition_Status();

		/**
		 * The meta object literal for the '<em><b>Edition Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITION__EDITION_CREATION_DATE = eINSTANCE.getEdition_EditionCreationDate();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITION__ID = eINSTANCE.getEdition_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.FolderMetaImpl <em>Folder Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.FolderMetaImpl
		 * @see lobj.impl.LobjPackageImpl#getFolderMeta()
		 * @generated
		 */
		EClass FOLDER_META = eINSTANCE.getFolderMeta();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER_META__TITLE = eINSTANCE.getFolderMeta_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER_META__DESCRIPTION = eINSTANCE.getFolderMeta_Description();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER_META__CREATION_DATE = eINSTANCE.getFolderMeta_CreationDate();

		/**
		 * The meta object literal for the '{@link lobj.impl.LuMetaImpl <em>Lu Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.LuMetaImpl
		 * @see lobj.impl.LobjPackageImpl#getLuMeta()
		 * @generated
		 */
		EClass LU_META = eINSTANCE.getLuMeta();

		/**
		 * The meta object literal for the '<em><b>Didac Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LU_META__DIDAC_META = eINSTANCE.getLuMeta_DidacMeta();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LU_META__CREATION_DATE = eINSTANCE.getLuMeta_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LU_META__DOMAIN = eINSTANCE.getLuMeta_Domain();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LU_META__AUTHORS = eINSTANCE.getLuMeta_Authors();

		/**
		 * The meta object literal for the '<em><b>Publish Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LU_META__PUBLISH_INFO = eINSTANCE.getLuMeta_PublishInfo();

		/**
		 * The meta object literal for the '<em><b>Def Lang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LU_META__DEF_LANG = eINSTANCE.getLuMeta_DefLang();

		/**
		 * The meta object literal for the '{@link lobj.impl.UserauthorizationImpl <em>Userauthorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.UserauthorizationImpl
		 * @see lobj.impl.LobjPackageImpl#getUserauthorization()
		 * @generated
		 */
		EClass USERAUTHORIZATION = eINSTANCE.getUserauthorization();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USERAUTHORIZATION__USER = eINSTANCE.getUserauthorization_User();

		/**
		 * The meta object literal for the '<em><b>Auth Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USERAUTHORIZATION__AUTH_TYPE = eINSTANCE.getUserauthorization_AuthType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERAUTHORIZATION__ID = eINSTANCE.getUserauthorization_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.NoteImpl
		 * @see lobj.impl.LobjPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DATE = eINSTANCE.getNote_Date();

		/**
		 * The meta object literal for the '<em><b>Note Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__NOTE_AUTHOR = eINSTANCE.getNote_NoteAuthor();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__CONTENT = eINSTANCE.getNote_Content();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__ID = eINSTANCE.getNote_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.PersonImpl
		 * @see lobj.impl.LobjPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Honorific</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__HONORIFIC = eINSTANCE.getPerson_Honorific();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SURNAME = eINSTANCE.getPerson_Surname();

		/**
		 * The meta object literal for the '<em><b>Contrib</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CONTRIB = eINSTANCE.getPerson_Contrib();

		/**
		 * The meta object literal for the '<em><b>Affiliations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__AFFILIATIONS = eINSTANCE.getPerson_Affiliations();

		/**
		 * The meta object literal for the '<em><b>Personblurb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSONBLURB = eINSTANCE.getPerson_Personblurb();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ID = eINSTANCE.getPerson_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.PublisherImpl
		 * @see lobj.impl.LobjPackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Publishername</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__PUBLISHERNAME = eINSTANCE.getPublisher_Publishername();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER__ADDRESS = eINSTANCE.getPublisher_Address();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__ID = eINSTANCE.getPublisher_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.PublishInfoImpl <em>Publish Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.PublishInfoImpl
		 * @see lobj.impl.LobjPackageImpl#getPublishInfo()
		 * @generated
		 */
		EClass PUBLISH_INFO = eINSTANCE.getPublishInfo();

		/**
		 * The meta object literal for the '<em><b>Edition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISH_INFO__EDITION = eINSTANCE.getPublishInfo_Edition();

		/**
		 * The meta object literal for the '<em><b>Pubdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISH_INFO__PUBDATE = eINSTANCE.getPublishInfo_Pubdate();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISH_INFO__PUBLISHER = eINSTANCE.getPublishInfo_Publisher();

		/**
		 * The meta object literal for the '<em><b>Pubsnumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISH_INFO__PUBSNUMBER = eINSTANCE.getPublishInfo_Pubsnumber();

		/**
		 * The meta object literal for the '<em><b>Releaseinfo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISH_INFO__RELEASEINFO = eINSTANCE.getPublishInfo_Releaseinfo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISH_INFO__ID = eINSTANCE.getPublishInfo_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.ResrcMetaImpl <em>Resrc Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ResrcMetaImpl
		 * @see lobj.impl.LobjPackageImpl#getResrcMeta()
		 * @generated
		 */
		EClass RESRC_META = eINSTANCE.getResrcMeta();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_META__FILENAME = eINSTANCE.getResrcMeta_Filename();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_META__PARAMETERS = eINSTANCE.getResrcMeta_Parameters();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_META__HEIGHT = eINSTANCE.getResrcMeta_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_META__WIDTH = eINSTANCE.getResrcMeta_Width();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_META__CREATION_DATE = eINSTANCE.getResrcMeta_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_META__LAST_MODIFIED = eINSTANCE.getResrcMeta_LastModified();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_META__TITLE = eINSTANCE.getResrcMeta_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_META__DESCRIPTION = eINSTANCE.getResrcMeta_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESRC_META__KEYWORDS = eINSTANCE.getResrcMeta_Keywords();

		/**
		 * The meta object literal for the '{@link lobj.impl.SharednotesImpl <em>Sharednotes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.SharednotesImpl
		 * @see lobj.impl.LobjPackageImpl#getSharednotes()
		 * @generated
		 */
		EClass SHAREDNOTES = eINSTANCE.getSharednotes();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAREDNOTES__NOTES = eINSTANCE.getSharednotes_Notes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAREDNOTES__ID = eINSTANCE.getSharednotes_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.CoursetypeImpl <em>Coursetype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.CoursetypeImpl
		 * @see lobj.impl.LobjPackageImpl#getCoursetype()
		 * @generated
		 */
		EClass COURSETYPE = eINSTANCE.getCoursetype();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSETYPE__LANGUAGE = eINSTANCE.getCoursetype_Language();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSETYPE__TITLE = eINSTANCE.getCoursetype_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSETYPE__DESCRIPTION = eINSTANCE.getCoursetype_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSETYPE__ID = eINSTANCE.getCoursetype_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.ExternalMetadataImpl <em>External Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ExternalMetadataImpl
		 * @see lobj.impl.LobjPackageImpl#getExternalMetadata()
		 * @generated
		 */
		EClass EXTERNAL_METADATA = eINSTANCE.getExternalMetadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_METADATA__REF = eINSTANCE.getExternalMetadata_Ref();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_METADATA__FILE = eINSTANCE.getExternalMetadata_File();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_METADATA__ID = eINSTANCE.getExternalMetadata_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.LanguageImpl
		 * @see lobj.impl.LobjPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__LANGUAGE = eINSTANCE.getLanguage_Language();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__CODE = eINSTANCE.getLanguage_Code();

		/**
		 * The meta object literal for the '{@link lobj.impl.PrecognitionImpl <em>Precognition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.PrecognitionImpl
		 * @see lobj.impl.LobjPackageImpl#getPrecognition()
		 * @generated
		 */
		EClass PRECOGNITION = eINSTANCE.getPrecognition();

		/**
		 * The meta object literal for the '<em><b>Precog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECOGNITION__PRECOG = eINSTANCE.getPrecognition_Precog();

		/**
		 * The meta object literal for the '<em><b>Internal Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECOGNITION__INTERNAL_REFS = eINSTANCE.getPrecognition_InternalRefs();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECOGNITION__ID = eINSTANCE.getPrecognition_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.InternalRefImpl <em>Internal Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.InternalRefImpl
		 * @see lobj.impl.LobjPackageImpl#getInternalRef()
		 * @generated
		 */
		EClass INTERNAL_REF = eINSTANCE.getInternalRef();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_REF__LANGUAGE = eINSTANCE.getInternalRef_Language();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_REF__REF = eINSTANCE.getInternalRef_Ref();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_REF__FILE = eINSTANCE.getInternalRef_File();

		/**
		 * The meta object literal for the '<em><b>Reftype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_REF__REFTYPE = eINSTANCE.getInternalRef_Reftype();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_REF__ID = eINSTANCE.getInternalRef_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.ModuleMetaImpl <em>Module Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.ModuleMetaImpl
		 * @see lobj.impl.LobjPackageImpl#getModuleMeta()
		 * @generated
		 */
		EClass MODULE_META = eINSTANCE.getModuleMeta();

		/**
		 * The meta object literal for the '<em><b>Didac Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_META__DIDAC_META = eINSTANCE.getModuleMeta_DidacMeta();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_META__CREATION_DATE = eINSTANCE.getModuleMeta_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Authors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_META__AUTHORS = eINSTANCE.getModuleMeta_Authors();

		/**
		 * The meta object literal for the '<em><b>Publish Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_META__PUBLISH_INFO = eINSTANCE.getModuleMeta_PublishInfo();

		/**
		 * The meta object literal for the '<em><b>Def Lang</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_META__DEF_LANG = eINSTANCE.getModuleMeta_DefLang();

		/**
		 * The meta object literal for the '{@link lobj.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.SourceImpl
		 * @see lobj.impl.LobjPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__AUTHOR = eINSTANCE.getSource_Author();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__TITLE = eINSTANCE.getSource_Title();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SUBTITLE = eINSTANCE.getSource_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Published In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__PUBLISHED_IN = eINSTANCE.getSource_PublishedIn();

		/**
		 * The meta object literal for the '<em><b>Published By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__PUBLISHED_BY = eINSTANCE.getSource_PublishedBy();

		/**
		 * The meta object literal for the '<em><b>Publish Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__PUBLISH_DATE = eINSTANCE.getSource_PublishDate();

		/**
		 * The meta object literal for the '<em><b>Pp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__PP = eINSTANCE.getSource_Pp();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__ID = eINSTANCE.getSource_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.AuthorizationTypesImpl <em>Authorization Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.AuthorizationTypesImpl
		 * @see lobj.impl.LobjPackageImpl#getAuthorizationTypes()
		 * @generated
		 */
		EClass AUTHORIZATION_TYPES = eINSTANCE.getAuthorizationTypes();

		/**
		 * The meta object literal for the '<em><b>Auth Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_TYPES__AUTH_TYPE = eINSTANCE.getAuthorizationTypes_AuthType();

		/**
		 * The meta object literal for the '<em><b>Auth Type Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_TYPES__AUTH_TYPE_DESC = eINSTANCE.getAuthorizationTypes_AuthTypeDesc();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_TYPES__READ_ONLY = eINSTANCE.getAuthorizationTypes_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_TYPES__ID = eINSTANCE.getAuthorizationTypes_Id();

		/**
		 * The meta object literal for the '{@link lobj.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lobj.impl.UserImpl
		 * @see lobj.impl.LobjPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Loginname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LOGINNAME = eINSTANCE.getUser_Loginname();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRSTNAME = eINSTANCE.getUser_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LASTNAME = eINSTANCE.getUser_Lastname();

		/**
		 * The meta object literal for the '<em><b>Matriculationnr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__MATRICULATIONNR = eINSTANCE.getUser_Matriculationnr();

		/**
		 * The meta object literal for the '<em><b>Scn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SCN = eINSTANCE.getUser_Scn();

		/**
		 * The meta object literal for the '<em><b>Icqnumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ICQNUMBER = eINSTANCE.getUser_Icqnumber();

		/**
		 * The meta object literal for the '<em><b>Icqpassword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ICQPASSWORD = eINSTANCE.getUser_Icqpassword();

		/**
		 * The meta object literal for the '<em><b>Entryasxml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ENTRYASXML = eINSTANCE.getUser_Entryasxml();

		/**
		 * The meta object literal for the '<em><b>Languagenr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LANGUAGENR = eINSTANCE.getUser_Languagenr();

		/**
		 * The meta object literal for the '<em><b>Notificationprofileasxml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NOTIFICATIONPROFILEASXML = eINSTANCE.getUser_Notificationprofileasxml();

		/**
		 * The meta object literal for the '<em><b>Dossierasxml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DOSSIERASXML = eINSTANCE.getUser_Dossierasxml();

		/**
		 * The meta object literal for the '<em><b>Photo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PHOTO = eINSTANCE.getUser_Photo();

		/**
		 * The meta object literal for the '<em><b>Onlinestatus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ONLINESTATUS = eINSTANCE.getUser_Onlinestatus();

		/**
		 * The meta object literal for the '<em><b>Onlinedate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ONLINEDATE = eINSTANCE.getUser_Onlinedate();

		/**
		 * The meta object literal for the '<em><b>Datafilter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DATAFILTER = eINSTANCE.getUser_Datafilter();

		/**
		 * The meta object literal for the '<em><b>Inchatsince</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__INCHATSINCE = eINSTANCE.getUser_Inchatsince();

		/**
		 * The meta object literal for the '<em><b>Contchatdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CONTCHATDATE = eINSTANCE.getUser_Contchatdate();

		/**
		 * The meta object literal for the '<em><b>Chatroomnr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CHATROOMNR = eINSTANCE.getUser_Chatroomnr();

		/**
		 * The meta object literal for the '<em><b>Fromext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FROMEXT = eINSTANCE.getUser_Fromext();

		/**
		 * The meta object literal for the '<em><b>Lastlogindate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LASTLOGINDATE = eINSTANCE.getUser_Lastlogindate();

		/**
		 * The meta object literal for the '<em><b>Currlogindate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CURRLOGINDATE = eINSTANCE.getUser_Currlogindate();

		/**
		 * The meta object literal for the '<em><b>Lastcoursematerialnr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LASTCOURSEMATERIALNR = eINSTANCE.getUser_Lastcoursematerialnr();

		/**
		 * The meta object literal for the '<em><b>Lastcoursematerialviewnr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LASTCOURSEMATERIALVIEWNR = eINSTANCE.getUser_Lastcoursematerialviewnr();

		/**
		 * The meta object literal for the '<em><b>Authenticateldap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__AUTHENTICATELDAP = eINSTANCE.getUser_Authenticateldap();

		/**
		 * The meta object literal for the '<em><b>Photochanged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PHOTOCHANGED = eINSTANCE.getUser_Photochanged();

		/**
		 * The meta object literal for the '<em><b>Authorizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__AUTHORIZATIONS = eINSTANCE.getUser_Authorizations();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

	}

} //LobjPackage

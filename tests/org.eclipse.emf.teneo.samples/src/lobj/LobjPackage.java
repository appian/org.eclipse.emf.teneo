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
	 * @gen
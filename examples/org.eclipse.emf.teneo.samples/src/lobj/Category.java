/**
 * <copyright>
 * </copyright>
 *
 * $Id: Category.java,v 1.3 2007/03/28 13:56:49 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Category#getTitleMeta <em>Title Meta</em>}</li>
 *   <li>{@link lobj.Category#getCourse <em>Course</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getCategory()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Category extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Title Meta</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.TitleMeta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Meta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Meta</em>' containment reference list.
	 * @see lobj.LobjPackage#getCategory_TitleMeta()
	 * @model type="lobj.TitleMeta" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getTitleMeta();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see lobj.LobjPackage#getCategory_Course()
	 * @model type="lobj.Course" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getCourse();

} // Category

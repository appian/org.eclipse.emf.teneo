/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Course</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.Course#getCourseMeta <em>Course Meta</em>}</li>
 * <li>{@link lobj.Course#getExternalMetadata <em>External Metadata</em>}</li>
 * <li>{@link lobj.Course#getCoursetype <em>Coursetype</em>}</li>
 * <li>{@link lobj.Course#getOutlineAsXml <em>Outline As Xml</em>}</li>
 * <li>{@link lobj.Course#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getCourse()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Course extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Course Meta</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Meta</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Course Meta</em>' containment reference.
	 * @see #setCourseMeta(CourseMeta)
	 * @see lobj.LobjPackage#getCourse_CourseMeta()
	 * @model containment="true" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	CourseMeta getCourseMeta();

	/**
	 * Sets the value of the '{@link lobj.Course#getCourseMeta <em>Course Meta</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Course Meta</em>' containment reference.
	 * @see #getCourseMeta()
	 * @generated
	 */
	void setCourseMeta(CourseMeta value);

	/**
	 * Returns the value of the '<em><b>External Metadata</b></em>' containment reference list. The
	 * list contents are of type {@link lobj.ExternalMetadata}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Metadata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>External Metadata</em>' containment reference list.
	 * @see lobj.LobjPackage#getCourse_ExternalMetadata()
	 * @model type="lobj.ExternalMetadata" containment="true" ordered="false"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getExternalMetadata();

	/**
	 * Returns the value of the '<em><b>Coursetype</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coursetype</em>' reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Coursetype</em>' reference.
	 * @see #setCoursetype(Coursetype)
	 * @see lobj.LobjPackage#getCourse_Coursetype()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Coursetype getCoursetype();

	/**
	 * Sets the value of the '{@link lobj.Course#getCoursetype <em>Coursetype</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Coursetype</em>' reference.
	 * @see #getCoursetype()
	 * @generated
	 */
	void setCoursetype(Coursetype value);

	/**
	 * Returns the value of the '<em><b>Outline As Xml</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline As Xml</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Outline As Xml</em>' attribute.
	 * @see #setOutlineAsXml(String)
	 * @see lobj.LobjPackage#getCourse_OutlineAsXml()
	 * @model unique="false"
	 * @generated
	 */
	String getOutlineAsXml();

	/**
	 * Sets the value of the '{@link lobj.Course#getOutlineAsXml <em>Outline As Xml</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Outline As Xml</em>' attribute.
	 * @see #getOutlineAsXml()
	 * @generated
	 */
	void setOutlineAsXml(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference list. The list contents are of type
	 * {@link lobj.Module}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Module</em>' reference list.
	 * @see lobj.LobjPackage#getCourse_Module()
	 * @model type="lobj.Module" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getModule();

} // Course

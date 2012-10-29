/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Course Meta</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.CourseMeta#getDidacMeta <em>Didac Meta</em>}</li>
 * <li>{@link lobj.CourseMeta#getHours <em>Hours</em>}</li>
 * <li>{@link lobj.CourseMeta#getLvanr <em>Lvanr</em>}</li>
 * <li>{@link lobj.CourseMeta#getColumnfilterasxml <em>Columnfilterasxml</em>}</li>
 * <li>{@link lobj.CourseMeta#getFromext <em>Fromext</em>}</li>
 * <li>{@link lobj.CourseMeta#getCreationDate <em>Creation Date</em>}</li>
 * <li>{@link lobj.CourseMeta#getLecturer <em>Lecturer</em>}</li>
 * <li>{@link lobj.CourseMeta#getDefLang <em>Def Lang</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getCourseMeta()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface CourseMeta extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Didac Meta</b></em>' containment reference list. The list
	 * contents are of type {@link lobj.DidacMeta}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Didac Meta</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Didac Meta</em>' containment reference list.
	 * @see lobj.LobjPackage#getCourseMeta_DidacMeta()
	 * @model type="lobj.DidacMeta" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getDidacMeta();

	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #isSetHours()
	 * @see #unsetHours()
	 * @see #setHours(int)
	 * @see lobj.LobjPackage#getCourseMeta_Hours()
	 * @model unique="false" unsettable="true" extendedMetaData="kind='element'"
	 * @generated
	 */
	int getHours();

	/**
	 * Sets the value of the '{@link lobj.CourseMeta#getHours <em>Hours</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Hours</em>' attribute.
	 * @see #isSetHours()
	 * @see #unsetHours()
	 * @see #getHours()
	 * @generated
	 */
	void setHours(int value);

	/**
	 * Unsets the value of the '{@link lobj.CourseMeta#getHours <em>Hours</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetHours()
	 * @see #getHours()
	 * @see #setHours(int)
	 * @generated
	 */
	void unsetHours();

	/**
	 * Returns whether the value of the '{@link lobj.CourseMeta#getHours <em>Hours</em>}' attribute is
	 * set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Hours</em>' attribute is set.
	 * @see #unsetHours()
	 * @see #getHours()
	 * @see #setHours(int)
	 * @generated
	 */
	boolean isSetHours();

	/**
	 * Returns the value of the '<em><b>Lvanr</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lvanr</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lvanr</em>' attribute.
	 * @see #setLvanr(String)
	 * @see lobj.LobjPackage#getCourseMeta_Lvanr()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getLvanr();

	/**
	 * Sets the value of the '{@link lobj.CourseMeta#getLvanr <em>Lvanr</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Lvanr</em>' attribute.
	 * @see #getLvanr()
	 * @generated
	 */
	void setLvanr(String value);

	/**
	 * Returns the value of the '<em><b>Columnfilterasxml</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnfilterasxml</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Columnfilterasxml</em>' attribute.
	 * @see #setColumnfilterasxml(String)
	 * @see lobj.LobjPackage#getCourseMeta_Columnfilterasxml()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getColumnfilterasxml();

	/**
	 * Sets the value of the '{@link lobj.CourseMeta#getColumnfilterasxml <em>Columnfilterasxml</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Columnfilterasxml</em>' attribute.
	 * @see #getColumnfilterasxml()
	 * @generated
	 */
	void setColumnfilterasxml(String value);

	/**
	 * Returns the value of the '<em><b>Fromext</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fromext</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fromext</em>' attribute.
	 * @see #setFromext(BigInteger)
	 * @see lobj.LobjPackage#getCourseMeta_Fromext()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	BigInteger getFromext();

	/**
	 * Sets the value of the '{@link lobj.CourseMeta#getFromext <em>Fromext</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Fromext</em>' attribute.
	 * @see #getFromext()
	 * @generated
	 */
	void setFromext(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see lobj.LobjPackage#getCourseMeta_CreationDate()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link lobj.CourseMeta#getCreationDate <em>Creation Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Lecturer</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lecturer</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lecturer</em>' reference.
	 * @see #setLecturer(User)
	 * @see lobj.LobjPackage#getCourseMeta_Lecturer()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	User getLecturer();

	/**
	 * Sets the value of the '{@link lobj.CourseMeta#getLecturer <em>Lecturer</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Lecturer</em>' reference.
	 * @see #getLecturer()
	 * @generated
	 */
	void setLecturer(User value);

	/**
	 * Returns the value of the '<em><b>Def Lang</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Lang</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Def Lang</em>' reference.
	 * @see #setDefLang(Language)
	 * @see lobj.LobjPackage#getCourseMeta_DefLang()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	Language getDefLang();

	/**
	 * Sets the value of the '{@link lobj.CourseMeta#getDefLang <em>Def Lang</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Def Lang</em>' reference.
	 * @see #getDefLang()
	 * @generated
	 */
	void setDefLang(Language value);

} // CourseMeta

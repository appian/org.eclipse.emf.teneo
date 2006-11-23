/**
 * <copyright>
 * </copyright>
 *
 * $Id: LearningObject.java,v 1.1 2006/11/23 06:12:08 mtaal Exp $
 */
package lobj;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.LearningObject#getId <em>Id</em>}</li>
 *   <li>{@link lobj.LearningObject#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link lobj.LearningObject#isSynchronized <em>Synchronized</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getLearningObject()
 * @model abstract="true"
 *        extendedMetaData="name='learningObject' kind='elementOnly'"
 * @generated
 */
public interface LearningObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getLearningObject_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.LearningObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see lobj.LobjPackage#getLearningObject_Timestamp()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='attribute' name='timestamp'"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link lobj.LearningObject#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronized</em>' attribute.
	 * @see #setSynchronized(boolean)
	 * @see lobj.LobjPackage#getLearningObject_Synchronized()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='attribute' name='synchronized'"
	 * @generated
	 */
	boolean isSynchronized();

	/**
	 * Sets the value of the '{@link lobj.LearningObject#isSynchronized <em>Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronized</em>' attribute.
	 * @see #isSynchronized()
	 * @generated
	 */
	void setSynchronized(boolean value);

} // LearningObject
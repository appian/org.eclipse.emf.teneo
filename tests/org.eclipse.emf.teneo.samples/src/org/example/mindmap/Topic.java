/**
 * <copyright>
 * </copyright>
 *
 * $Id: Topic.java,v 1.1 2006/11/23 06:12:14 mtaal Exp $
 */
package org.example.mindmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.example.mindmap.Topic#getComments <em>Comments</em>}</li>
 *   <li>{@link org.example.mindmap.Topic#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.example.mindmap.Topic#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.example.mindmap.Topic#getName <em>Name</em>}</li>
 *   <li>{@link org.example.mindmap.Topic#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.example.mindmap.Topic#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.example.mindmap.Topic#getResources <em>Resources</em>}</li>
 *   <li>{@link org.example.mindmap.Topic#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.example.mindmap.Topic#getSubtopics <em>Subtopics</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.example.mindmap.MindmapPackage#getTopic()
 * @model extendedMetaData="name='Topic' kind='elementOnly'"
 * @generated
 */
public interface Topic extends EObject {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link org.example.mindmap.Thread}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see org.example.mindmap.MindmapPackage#getTopic_Comments()
	 * @model type="org.example.mindmap.Thread" containment="true"
	 *        extendedMetaData="kind='element' name='comments'"
	 * @generated
	 */
	EList getComments();

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #setDuration(float)
	 * @see org.example.mindmap.MindmapPackage#getTopic_Duration()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='duration'"
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link org.example.mindmap.Topic#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #isSetDuration()
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

	/**
	 * Unsets the value of the '{@link org.example.mindmap.Topic#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDuration()
	 * @see #getDuration()
	 * @see #setDuration(float)
	 * @generated
	 */
	void unsetDuration();

	/**
	 * Returns whether the value of the '{@link org.example.mindmap.Topic#getDuration <em>Duration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duration</em>' attribute is set.
	 * @see #unsetDuration()
	 * @see #getDuration()
	 * @see #setDuration(float)
	 * @generated
	 */
	boolean isSetDuration();

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Object)
	 * @see org.example.mindmap.MindmapPackage#getTopic_EndDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='endDate'"
	 * @generated
	 */
	Object getEndDate();

	/**
	 * Sets the value of the '{@link org.example.mindmap.Topic#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.example.mindmap.MindmapPackage#getTopic_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.example.mindmap.Topic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Complete</em>' attribute.
	 * @see #isSetPercentComplete()
	 * @see #unsetPercentComplete()
	 * @see #setPercentComplete(float)
	 * @see org.example.mindmap.MindmapPackage#getTopic_PercentComplete()
	 * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='percentComplete'"
	 * @generated
	 */
	float getPercentComplete();

	/**
	 * Sets the value of the '{@link org.example.mindmap.Topic#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' attribute.
	 * @see #isSetPercentComplete()
	 * @see #unsetPercentComplete()
	 * @see #getPercentComplete()
	 * @generated
	 */
	void setPercentComplete(float value);

	/**
	 * Unsets the value of the '{@link org.example.mindmap.Topic#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPercentComplete()
	 * @see #getPercentComplete()
	 * @see #setPercentComplete(float)
	 * @generated
	 */
	void unsetPercentComplete();

	/**
	 * Returns whether the value of the '{@link org.example.mindmap.Topic#getPercentComplete <em>Percent Complete</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Percent Complete</em>' attribute is set.
	 * @see #unsetPercentComplete()
	 * @see #getPercentComplete()
	 * @see #setPercentComplete(float)
	 * @generated
	 */
	boolean isSetPercentComplete();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"ZERO"</code>.
	 * The literals are from the enumeration {@link org.example.mindmap.Priority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see org.example.mindmap.Priority
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #setPriority(Priority)
	 * @see org.example.mindmap.MindmapPackage#getTopic_Priority()
	 * @model default="ZERO" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link org.example.mindmap.Topic#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see org.example.mindmap.Priority
	 * @see #isSetPriority()
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Unsets the value of the '{@link org.example.mindmap.Topic#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriority()
	 * @see #getPriority()
	 * @see #setPriority(Priority)
	 * @generated
	 */
	void unsetPriority();

	/**
	 * Returns whether the value of the '{@link org.example.mindmap.Topic#getPriority <em>Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priority</em>' attribute is set.
	 * @see #unsetPriority()
	 * @see #getPriority()
	 * @see #setPriority(Priority)
	 * @generated
	 */
	boolean isSetPriority();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.example.mindmap.Resource}.
	 * It is bidirectional and its opposite is '{@link org.example.mindmap.Resource#getTopics <em>Topics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.example.mindmap.MindmapPackage#getTopic_Resources()
	 * @see org.example.mindmap.Resource#getTopics
	 * @model type="org.example.mindmap.Resource" opposite="topics"
	 *        extendedMetaData="kind='attribute' name='resources'"
	 * @generated
	 */
	EList getResources();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Object)
	 * @see org.example.mindmap.MindmapPackage#getTopic_StartDate()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='attribute' name='startDate'"
	 * @generated
	 */
	Object getStartDate();

	/**
	 * Sets the value of the '{@link org.example.mindmap.Topic#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Object value);

	/**
	 * Returns the value of the '<em><b>Subtopics</b></em>' reference list.
	 * The list contents are of type {@link org.example.mindmap.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtopics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtopics</em>' reference list.
	 * @see org.example.mindmap.MindmapPackage#getTopic_Subtopics()
	 * @model type="org.example.mindmap.Topic"
	 *        extendedMetaData="kind='attribute' name='subtopics'"
	 * @generated
	 */
	EList getSubtopics();

} // Topic
/**
 * <copyright>
 * </copyright>
 *
 * $Id: Map.java,v 1.1 2006/11/15 17:18:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.mindmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Map#getRootTopics <em>Root Topics</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Map#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Map#getResources <em>Resources</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Map#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getMap()
 * @model extendedMetaData="name='Map' kind='elementOnly'"
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Topics</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Topic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Topics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Topics</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getMap_RootTopics()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.mindmap.Topic" containment="true"
	 *        extendedMetaData="kind='element' name='rootTopics'"
	 * @generated
	 */
	EList getRootTopics();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getMap_Relations()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship" containment="true"
	 *        extendedMetaData="kind='element' name='relations'"
	 * @generated
	 */
	EList getRelations();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getMap_Resources()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.mindmap.Resource" containment="true"
	 *        extendedMetaData="kind='element' name='resources'"
	 * @generated
	 */
	EList getResources();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getMap_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Map#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Map
/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relationship.java,v 1.1 2006/11/15 17:18:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.mindmap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getRelationship()
 * @model extendedMetaData="name='Relationship' kind='empty'"
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getRelationship_Label()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Topic)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getRelationship_Source()
	 * @model extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	Topic getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Topic value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Topic)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getRelationship_Target()
	 * @model extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	Topic getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Topic value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"DEPENDENCY"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.RelationshipType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(RelationshipType)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.MindmapPackage#getRelationship_Type()
	 * @model default="DEPENDENCY" unique="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	RelationshipType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.mindmap.RelationshipType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationshipType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(RelationshipType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.mindmap.Relationship#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(RelationshipType)
	 * @generated
	 */
	boolean isSetType();

} // Relationship
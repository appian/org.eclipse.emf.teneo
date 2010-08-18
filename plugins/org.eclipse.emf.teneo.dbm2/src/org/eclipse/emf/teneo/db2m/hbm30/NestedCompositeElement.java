/**
 * <copyright>
 * </copyright>
 *
 * $Id: NestedCompositeElement.java,v 1.1 2010/08/18 09:21:40 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Composite Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getNestedCompositeElement <em>Nested Composite Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement()
 * @model extendedMetaData="name='nested-composite-element' kind='elementOnly'"
 * @generated
 */
public interface NestedCompositeElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Parent)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent'"
	 * @generated
	 */
	Parent getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Parent value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' group='#group:1'"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Many To One</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many To One</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many To One</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement_ManyToOne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='many-to-one' group='#group:1'"
	 * @generated
	 */
	EList<ManyToOne> getManyToOne();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Any}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement_Any()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='any' group='#group:1'"
	 * @generated
	 */
	EList<Any> getAny();

	/**
	 * Returns the value of the '<em><b>Nested Composite Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Composite Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Composite Element</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement_NestedCompositeElement()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nested-composite-element' group='#group:1'"
	 * @generated
	 */
	EList<NestedCompositeElement> getNestedCompositeElement();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement_Access()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getNestedCompositeElement_Node()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='node'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.NestedCompositeElement#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

} // NestedCompositeElement

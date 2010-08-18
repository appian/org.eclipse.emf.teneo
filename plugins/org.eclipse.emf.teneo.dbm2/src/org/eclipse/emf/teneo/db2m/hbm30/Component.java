/**
 * <copyright>
 * </copyright>
 *
 * $Id: Component.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getTuplizer <em>Tuplizer</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getDynamicComponent <em>Dynamic Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getMap <em>Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getList <em>List</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getBag <em>Bag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getArray <em>Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getPrimitiveArray <em>Primitive Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isOptimisticLock <em>Optimistic Lock</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent()
 * @model extendedMetaData="name='component' kind='elementOnly'"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Meta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Meta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meta'"
	 * @generated
	 */
	EList<Meta> getMeta();

	/**
	 * Returns the value of the '<em><b>Tuplizer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Tuplizer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuplizer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuplizer</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Tuplizer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tuplizer'"
	 * @generated
	 */
	EList<Tuplizer> getTuplizer();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Parent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parent'"
	 * @generated
	 */
	Parent getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getParent <em>Parent</em>}' containment reference.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' group='#group:3'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_ManyToOne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='many-to-one' group='#group:3'"
	 * @generated
	 */
	EList<ManyToOne> getManyToOne();

	/**
	 * Returns the value of the '<em><b>One To One</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.OneToOne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One To One</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One To One</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_OneToOne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='one-to-one' group='#group:3'"
	 * @generated
	 */
	EList<OneToOne> getOneToOne();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Component()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='component' group='#group:3'"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Dynamic Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.DynamicComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Component</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_DynamicComponent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dynamic-component' group='#group:3'"
	 * @generated
	 */
	EList<DynamicComponent> getDynamicComponent();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Any()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='any' group='#group:3'"
	 * @generated
	 */
	EList<Any> getAny();

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Map}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Map()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='map' group='#group:3'"
	 * @generated
	 */
	EList<Map> getMap();

	/**
	 * Returns the value of the '<em><b>Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Set}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Set()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='set' group='#group:3'"
	 * @generated
	 */
	EList<Set> getSet();

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.List}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_List()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' group='#group:3'"
	 * @generated
	 */
	EList<List> getList();

	/**
	 * Returns the value of the '<em><b>Bag</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Bag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bag</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Bag()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bag' group='#group:3'"
	 * @generated
	 */
	EList<Bag> getBag();

	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Array}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Array()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='array' group='#group:3'"
	 * @generated
	 */
	EList<Array> getArray();

	/**
	 * Returns the value of the '<em><b>Primitive Array</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Array</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Array</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_PrimitiveArray()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primitive-array' group='#group:3'"
	 * @generated
	 */
	EList<PrimitiveArray> getPrimitiveArray();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Access()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getAccess <em>Access</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' attribute.
	 * @see #isSetInsert()
	 * @see #unsetInsert()
	 * @see #setInsert(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Insert()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='insert'"
	 * @generated
	 */
	boolean isInsert();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isInsert <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert</em>' attribute.
	 * @see #isSetInsert()
	 * @see #unsetInsert()
	 * @see #isInsert()
	 * @generated
	 */
	void setInsert(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isInsert <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsert()
	 * @see #isInsert()
	 * @see #setInsert(boolean)
	 * @generated
	 */
	void unsetInsert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isInsert <em>Insert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Insert</em>' attribute is set.
	 * @see #unsetInsert()
	 * @see #isInsert()
	 * @see #setInsert(boolean)
	 * @generated
	 */
	boolean isSetInsert();

	/**
	 * Returns the value of the '<em><b>Lazy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lazy</em>' attribute.
	 * @see #isSetLazy()
	 * @see #unsetLazy()
	 * @see #setLazy(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Lazy()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='lazy'"
	 * @generated
	 */
	boolean isLazy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy</em>' attribute.
	 * @see #isSetLazy()
	 * @see #unsetLazy()
	 * @see #isLazy()
	 * @generated
	 */
	void setLazy(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLazy()
	 * @see #isLazy()
	 * @see #setLazy(boolean)
	 * @generated
	 */
	void unsetLazy();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isLazy <em>Lazy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lazy</em>' attribute is set.
	 * @see #unsetLazy()
	 * @see #isLazy()
	 * @see #setLazy(boolean)
	 * @generated
	 */
	boolean isSetLazy();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Node()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='node'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * Returns the value of the '<em><b>Optimistic Lock</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optimistic Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimistic Lock</em>' attribute.
	 * @see #isSetOptimisticLock()
	 * @see #unsetOptimisticLock()
	 * @see #setOptimisticLock(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_OptimisticLock()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='optimistic-lock'"
	 * @generated
	 */
	boolean isOptimisticLock();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isOptimisticLock <em>Optimistic Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimistic Lock</em>' attribute.
	 * @see #isSetOptimisticLock()
	 * @see #unsetOptimisticLock()
	 * @see #isOptimisticLock()
	 * @generated
	 */
	void setOptimisticLock(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isOptimisticLock <em>Optimistic Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptimisticLock()
	 * @see #isOptimisticLock()
	 * @see #setOptimisticLock(boolean)
	 * @generated
	 */
	void unsetOptimisticLock();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isOptimisticLock <em>Optimistic Lock</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Optimistic Lock</em>' attribute is set.
	 * @see #unsetOptimisticLock()
	 * @see #isOptimisticLock()
	 * @see #setOptimisticLock(boolean)
	 * @generated
	 */
	boolean isSetOptimisticLock();

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #isSetUnique()
	 * @see #unsetUnique()
	 * @see #setUnique(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Unique()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='unique'"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isSetUnique()
	 * @see #unsetUnique()
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	void unsetUnique();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isUnique <em>Unique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unique</em>' attribute is set.
	 * @see #unsetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	boolean isSetUnique();

	/**
	 * Returns the value of the '<em><b>Update</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' attribute.
	 * @see #isSetUpdate()
	 * @see #unsetUpdate()
	 * @see #setUpdate(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getComponent_Update()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='update'"
	 * @generated
	 */
	boolean isUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see #isSetUpdate()
	 * @see #unsetUpdate()
	 * @see #isUpdate()
	 * @generated
	 */
	void setUpdate(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdate()
	 * @see #isUpdate()
	 * @see #setUpdate(boolean)
	 * @generated
	 */
	void unsetUpdate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.Component#isUpdate <em>Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update</em>' attribute is set.
	 * @see #unsetUpdate()
	 * @see #isUpdate()
	 * @see #setUpdate(boolean)
	 * @generated
	 */
	boolean isSetUpdate();

} // Component

/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinedSubclass.java,v 1.1 2010/08/18 09:21:40 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joined Subclass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSubselect <em>Subselect</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getTuplizer <em>Tuplizer</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getManyToOne <em>Many To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getDynamicComponent <em>Dynamic Component</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getMap <em>Map</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSet <em>Set</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getList <em>List</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getBag <em>Bag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getIdbag <em>Idbag</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getArray <em>Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getPrimitiveArray <em>Primitive Array</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getJoinedSubclass <em>Joined Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getLoader <em>Loader</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlInsert <em>Sql Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlUpdate <em>Sql Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlDelete <em>Sql Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getResultset <em>Resultset</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getCheck <em>Check</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicInsert <em>Dynamic Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicUpdate <em>Dynamic Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getPersister <em>Persister</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getProxy <em>Proxy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isSelectBeforeUpdate <em>Select Before Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSubselect1 <em>Subselect1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass()
 * @model extendedMetaData="name='joined-subclass' kind='elementOnly'"
 * @generated
 */
public interface JoinedSubclass extends EObject {
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Meta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meta'"
	 * @generated
	 */
	EList<Meta> getMeta();

	/**
	 * Returns the value of the '<em><b>Subselect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subselect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subselect</em>' attribute.
	 * @see #setSubselect(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Subselect()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='subselect'"
	 * @generated
	 */
	String getSubselect();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSubselect <em>Subselect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subselect</em>' attribute.
	 * @see #getSubselect()
	 * @generated
	 */
	void setSubselect(String value);

	/**
	 * Returns the value of the '<em><b>Synchronize</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Synchronize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronize</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronize</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Synchronize()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synchronize'"
	 * @generated
	 */
	EList<Synchronize> getSynchronize();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Tuplizer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tuplizer'"
	 * @generated
	 */
	EList<Tuplizer> getTuplizer();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(Key)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Key()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	Key getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Key value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:6'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' group='#group:6'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_ManyToOne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='many-to-one' group='#group:6'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_OneToOne()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='one-to-one' group='#group:6'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Component()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='component' group='#group:6'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_DynamicComponent()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dynamic-component' group='#group:6'"
	 * @generated
	 */
	EList<DynamicComponent> getDynamicComponent();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Properties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Properties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties' group='#group:6'"
	 * @generated
	 */
	EList<Properties> getProperties();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Any()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='any' group='#group:6'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Map()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='map' group='#group:6'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Set()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='set' group='#group:6'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_List()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' group='#group:6'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Bag()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bag' group='#group:6'"
	 * @generated
	 */
	EList<Bag> getBag();

	/**
	 * Returns the value of the '<em><b>Idbag</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Idbag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idbag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idbag</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Idbag()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idbag' group='#group:6'"
	 * @generated
	 */
	EList<Idbag> getIdbag();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Array()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='array' group='#group:6'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_PrimitiveArray()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primitive-array' group='#group:6'"
	 * @generated
	 */
	EList<PrimitiveArray> getPrimitiveArray();

	/**
	 * Returns the value of the '<em><b>Joined Subclass</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joined Subclass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joined Subclass</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_JoinedSubclass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='joined-subclass'"
	 * @generated
	 */
	EList<JoinedSubclass> getJoinedSubclass();

	/**
	 * Returns the value of the '<em><b>Loader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loader</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loader</em>' containment reference.
	 * @see #setLoader(Loader)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Loader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loader'"
	 * @generated
	 */
	Loader getLoader();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getLoader <em>Loader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loader</em>' containment reference.
	 * @see #getLoader()
	 * @generated
	 */
	void setLoader(Loader value);

	/**
	 * Returns the value of the '<em><b>Sql Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Insert</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Insert</em>' containment reference.
	 * @see #setSqlInsert(SqlInsert)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_SqlInsert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sql-insert'"
	 * @generated
	 */
	SqlInsert getSqlInsert();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlInsert <em>Sql Insert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Insert</em>' containment reference.
	 * @see #getSqlInsert()
	 * @generated
	 */
	void setSqlInsert(SqlInsert value);

	/**
	 * Returns the value of the '<em><b>Sql Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Update</em>' containment reference.
	 * @see #setSqlUpdate(SqlUpdate)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_SqlUpdate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sql-update'"
	 * @generated
	 */
	SqlUpdate getSqlUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlUpdate <em>Sql Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Update</em>' containment reference.
	 * @see #getSqlUpdate()
	 * @generated
	 */
	void setSqlUpdate(SqlUpdate value);

	/**
	 * Returns the value of the '<em><b>Sql Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Delete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Delete</em>' containment reference.
	 * @see #setSqlDelete(SqlDelete)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_SqlDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sql-delete'"
	 * @generated
	 */
	SqlDelete getSqlDelete();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSqlDelete <em>Sql Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Delete</em>' containment reference.
	 * @see #getSqlDelete()
	 * @generated
	 */
	void setSqlDelete(SqlDelete value);

	/**
	 * Returns the value of the '<em><b>Resultset</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Resultset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resultset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultset</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Resultset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resultset'"
	 * @generated
	 */
	EList<Resultset> getResultset();

	/**
	 * Returns the value of the '<em><b>Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group1</em>' attribute list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:27'"
	 * @generated
	 */
	FeatureMap getGroup1();

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Query()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='query' group='#group:27'"
	 * @generated
	 */
	EList<Query> getQuery();

	/**
	 * Returns the value of the '<em><b>Sql Query</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Query</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Query</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_SqlQuery()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sql-query' group='#group:27'"
	 * @generated
	 */
	EList<SqlQuery> getSqlQuery();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Abstract()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='abstract'"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #isAbstract()
	 * @see #setAbstract(boolean)
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns the value of the '<em><b>Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batch Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batch Size</em>' attribute.
	 * @see #setBatchSize(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_BatchSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='batch-size'"
	 * @generated
	 */
	String getBatchSize();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getBatchSize <em>Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Size</em>' attribute.
	 * @see #getBatchSize()
	 * @generated
	 */
	void setBatchSize(String value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see #setCatalog(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Catalog()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalog'"
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' attribute.
	 * @see #setCheck(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Check()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='check'"
	 * @generated
	 */
	String getCheck();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getCheck <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' attribute.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(String value);

	/**
	 * Returns the value of the '<em><b>Dynamic Insert</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Insert</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Insert</em>' attribute.
	 * @see #isSetDynamicInsert()
	 * @see #unsetDynamicInsert()
	 * @see #setDynamicInsert(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_DynamicInsert()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='dynamic-insert'"
	 * @generated
	 */
	boolean isDynamicInsert();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicInsert <em>Dynamic Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Insert</em>' attribute.
	 * @see #isSetDynamicInsert()
	 * @see #unsetDynamicInsert()
	 * @see #isDynamicInsert()
	 * @generated
	 */
	void setDynamicInsert(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicInsert <em>Dynamic Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDynamicInsert()
	 * @see #isDynamicInsert()
	 * @see #setDynamicInsert(boolean)
	 * @generated
	 */
	void unsetDynamicInsert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicInsert <em>Dynamic Insert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dynamic Insert</em>' attribute is set.
	 * @see #unsetDynamicInsert()
	 * @see #isDynamicInsert()
	 * @see #setDynamicInsert(boolean)
	 * @generated
	 */
	boolean isSetDynamicInsert();

	/**
	 * Returns the value of the '<em><b>Dynamic Update</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Update</em>' attribute.
	 * @see #isSetDynamicUpdate()
	 * @see #unsetDynamicUpdate()
	 * @see #setDynamicUpdate(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_DynamicUpdate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='dynamic-update'"
	 * @generated
	 */
	boolean isDynamicUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicUpdate <em>Dynamic Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Update</em>' attribute.
	 * @see #isSetDynamicUpdate()
	 * @see #unsetDynamicUpdate()
	 * @see #isDynamicUpdate()
	 * @generated
	 */
	void setDynamicUpdate(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicUpdate <em>Dynamic Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDynamicUpdate()
	 * @see #isDynamicUpdate()
	 * @see #setDynamicUpdate(boolean)
	 * @generated
	 */
	void unsetDynamicUpdate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isDynamicUpdate <em>Dynamic Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dynamic Update</em>' attribute is set.
	 * @see #unsetDynamicUpdate()
	 * @see #isDynamicUpdate()
	 * @see #setDynamicUpdate(boolean)
	 * @generated
	 */
	boolean isSetDynamicUpdate();

	/**
	 * Returns the value of the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Name</em>' attribute.
	 * @see #setEntityName(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_EntityName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='entity-name'"
	 * @generated
	 */
	String getEntityName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getEntityName <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Name</em>' attribute.
	 * @see #getEntityName()
	 * @generated
	 */
	void setEntityName(String value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' attribute.
	 * @see #setExtends(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Extends()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='extends'"
	 * @generated
	 */
	String getExtends();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getExtends <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' attribute.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(String value);

	/**
	 * Returns the value of the '<em><b>Lazy</b></em>' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Lazy()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='lazy'"
	 * @generated
	 */
	boolean isLazy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isLazy <em>Lazy</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLazy()
	 * @see #isLazy()
	 * @see #setLazy(boolean)
	 * @generated
	 */
	void unsetLazy();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isLazy <em>Lazy</em>}' attribute is set.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Node()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='node'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * Returns the value of the '<em><b>Persister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persister</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persister</em>' attribute.
	 * @see #setPersister(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Persister()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='persister'"
	 * @generated
	 */
	String getPersister();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getPersister <em>Persister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persister</em>' attribute.
	 * @see #getPersister()
	 * @generated
	 */
	void setPersister(String value);

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' attribute.
	 * @see #setProxy(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Proxy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='proxy'"
	 * @generated
	 */
	String getProxy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getProxy <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' attribute.
	 * @see #getProxy()
	 * @generated
	 */
	void setProxy(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' attribute.
	 * @see #setSchema(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Schema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schema'"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

	/**
	 * Returns the value of the '<em><b>Select Before Update</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Before Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Before Update</em>' attribute.
	 * @see #isSetSelectBeforeUpdate()
	 * @see #unsetSelectBeforeUpdate()
	 * @see #setSelectBeforeUpdate(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_SelectBeforeUpdate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='select-before-update'"
	 * @generated
	 */
	boolean isSelectBeforeUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isSelectBeforeUpdate <em>Select Before Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Before Update</em>' attribute.
	 * @see #isSetSelectBeforeUpdate()
	 * @see #unsetSelectBeforeUpdate()
	 * @see #isSelectBeforeUpdate()
	 * @generated
	 */
	void setSelectBeforeUpdate(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isSelectBeforeUpdate <em>Select Before Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelectBeforeUpdate()
	 * @see #isSelectBeforeUpdate()
	 * @see #setSelectBeforeUpdate(boolean)
	 * @generated
	 */
	void unsetSelectBeforeUpdate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#isSelectBeforeUpdate <em>Select Before Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Select Before Update</em>' attribute is set.
	 * @see #unsetSelectBeforeUpdate()
	 * @see #isSelectBeforeUpdate()
	 * @see #setSelectBeforeUpdate(boolean)
	 * @generated
	 */
	boolean isSetSelectBeforeUpdate();

	/**
	 * Returns the value of the '<em><b>Subselect1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subselect1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subselect1</em>' attribute.
	 * @see #setSubselect1(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Subselect1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='subselect'"
	 * @generated
	 */
	String getSubselect1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getSubselect1 <em>Subselect1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subselect1</em>' attribute.
	 * @see #getSubselect1()
	 * @generated
	 */
	void setSubselect1(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getJoinedSubclass_Table()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='table'"
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.JoinedSubclass#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

} // JoinedSubclass

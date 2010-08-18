/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimitiveArray.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSubselect <em>Subselect</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCache <em>Cache</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getListIndex <em>List Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getLoader <em>Loader</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlInsert <em>Sql Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlUpdate <em>Sql Update</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlDelete <em>Sql Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlDeleteAll <em>Sql Delete All</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getBatchSize <em>Batch Size</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCheck <em>Check</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isEmbedXml <em>Embed Xml</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isOptimisticLock <em>Optimistic Lock</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getOuterJoin <em>Outer Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getPersister <em>Persister</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSubselect1 <em>Subselect1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray()
 * @model extendedMetaData="name='primitive-array' kind='elementOnly'"
 * @generated
 */
public interface PrimitiveArray extends EObject {
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Meta()
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Subselect()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='subselect'"
	 * @generated
	 */
	String getSubselect();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSubselect <em>Subselect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subselect</em>' attribute.
	 * @see #getSubselect()
	 * @generated
	 */
	void setSubselect(String value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' containment reference.
	 * @see #setCache(Cache)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Cache()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cache'"
	 * @generated
	 */
	Cache getCache();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCache <em>Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' containment reference.
	 * @see #getCache()
	 * @generated
	 */
	void setCache(Cache value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Synchronize()
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Key()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	Key getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Key value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Index)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Index()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='index'"
	 * @generated
	 */
	Index getIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Index value);

	/**
	 * Returns the value of the '<em><b>List Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Index</em>' containment reference.
	 * @see #setListIndex(ListIndex)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_ListIndex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='list-index'"
	 * @generated
	 */
	ListIndex getListIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getListIndex <em>List Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Index</em>' containment reference.
	 * @see #getListIndex()
	 * @generated
	 */
	void setListIndex(ListIndex value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Element)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Element()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element'"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Loader()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loader'"
	 * @generated
	 */
	Loader getLoader();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getLoader <em>Loader</em>}' containment reference.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_SqlInsert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sql-insert'"
	 * @generated
	 */
	SqlInsert getSqlInsert();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlInsert <em>Sql Insert</em>}' containment reference.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_SqlUpdate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sql-update'"
	 * @generated
	 */
	SqlUpdate getSqlUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlUpdate <em>Sql Update</em>}' containment reference.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_SqlDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sql-delete'"
	 * @generated
	 */
	SqlDelete getSqlDelete();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlDelete <em>Sql Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Delete</em>' containment reference.
	 * @see #getSqlDelete()
	 * @generated
	 */
	void setSqlDelete(SqlDelete value);

	/**
	 * Returns the value of the '<em><b>Sql Delete All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sql Delete All</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql Delete All</em>' containment reference.
	 * @see #setSqlDeleteAll(SqlDeleteAll)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_SqlDeleteAll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sql-delete-all'"
	 * @generated
	 */
	SqlDeleteAll getSqlDeleteAll();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSqlDeleteAll <em>Sql Delete All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql Delete All</em>' containment reference.
	 * @see #getSqlDeleteAll()
	 * @generated
	 */
	void setSqlDeleteAll(SqlDeleteAll value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Access()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_BatchSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='batch-size'"
	 * @generated
	 */
	String getBatchSize();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getBatchSize <em>Batch Size</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Catalog()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalog'"
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCatalog <em>Catalog</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Check()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='check'"
	 * @generated
	 */
	String getCheck();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCheck <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' attribute.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(String value);

	/**
	 * Returns the value of the '<em><b>Collection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Type</em>' attribute.
	 * @see #setCollectionType(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_CollectionType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='collection-type'"
	 * @generated
	 */
	String getCollectionType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getCollectionType <em>Collection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Type</em>' attribute.
	 * @see #getCollectionType()
	 * @generated
	 */
	void setCollectionType(String value);

	/**
	 * Returns the value of the '<em><b>Embed Xml</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embed Xml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embed Xml</em>' attribute.
	 * @see #isSetEmbedXml()
	 * @see #unsetEmbedXml()
	 * @see #setEmbedXml(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_EmbedXml()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='embed-xml'"
	 * @generated
	 */
	boolean isEmbedXml();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isEmbedXml <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embed Xml</em>' attribute.
	 * @see #isSetEmbedXml()
	 * @see #unsetEmbedXml()
	 * @see #isEmbedXml()
	 * @generated
	 */
	void setEmbedXml(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isEmbedXml <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmbedXml()
	 * @see #isEmbedXml()
	 * @see #setEmbedXml(boolean)
	 * @generated
	 */
	void unsetEmbedXml();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isEmbedXml <em>Embed Xml</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Embed Xml</em>' attribute is set.
	 * @see #unsetEmbedXml()
	 * @see #isEmbedXml()
	 * @see #setEmbedXml(boolean)
	 * @generated
	 */
	boolean isSetEmbedXml();

	/**
	 * Returns the value of the '<em><b>Fetch</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.Fetch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Fetch
	 * @see #isSetFetch()
	 * @see #unsetFetch()
	 * @see #setFetch(Fetch)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Fetch()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fetch'"
	 * @generated
	 */
	Fetch getFetch();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Fetch
	 * @see #isSetFetch()
	 * @see #unsetFetch()
	 * @see #getFetch()
	 * @generated
	 */
	void setFetch(Fetch value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFetch()
	 * @see #getFetch()
	 * @see #setFetch(Fetch)
	 * @generated
	 */
	void unsetFetch();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getFetch <em>Fetch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fetch</em>' attribute is set.
	 * @see #unsetFetch()
	 * @see #getFetch()
	 * @see #setFetch(Fetch)
	 * @generated
	 */
	boolean isSetFetch();

	/**
	 * Returns the value of the '<em><b>Mutable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutable</em>' attribute.
	 * @see #isSetMutable()
	 * @see #unsetMutable()
	 * @see #setMutable(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Mutable()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='mutable'"
	 * @generated
	 */
	boolean isMutable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isMutable <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutable</em>' attribute.
	 * @see #isSetMutable()
	 * @see #unsetMutable()
	 * @see #isMutable()
	 * @generated
	 */
	void setMutable(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isMutable <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMutable()
	 * @see #isMutable()
	 * @see #setMutable(boolean)
	 * @generated
	 */
	void unsetMutable();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isMutable <em>Mutable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mutable</em>' attribute is set.
	 * @see #unsetMutable()
	 * @see #isMutable()
	 * @see #setMutable(boolean)
	 * @generated
	 */
	boolean isSetMutable();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Node()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='node'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getNode <em>Node</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_OptimisticLock()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='optimistic-lock'"
	 * @generated
	 */
	boolean isOptimisticLock();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isOptimisticLock <em>Optimistic Lock</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isOptimisticLock <em>Optimistic Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptimisticLock()
	 * @see #isOptimisticLock()
	 * @see #setOptimisticLock(boolean)
	 * @generated
	 */
	void unsetOptimisticLock();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#isOptimisticLock <em>Optimistic Lock</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Outer Join</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.Outerjoin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Join</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Join</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Outerjoin
	 * @see #isSetOuterJoin()
	 * @see #unsetOuterJoin()
	 * @see #setOuterJoin(Outerjoin)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_OuterJoin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='outer-join'"
	 * @generated
	 */
	Outerjoin getOuterJoin();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getOuterJoin <em>Outer Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Join</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Outerjoin
	 * @see #isSetOuterJoin()
	 * @see #unsetOuterJoin()
	 * @see #getOuterJoin()
	 * @generated
	 */
	void setOuterJoin(Outerjoin value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getOuterJoin <em>Outer Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOuterJoin()
	 * @see #getOuterJoin()
	 * @see #setOuterJoin(Outerjoin)
	 * @generated
	 */
	void unsetOuterJoin();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getOuterJoin <em>Outer Join</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Outer Join</em>' attribute is set.
	 * @see #unsetOuterJoin()
	 * @see #getOuterJoin()
	 * @see #setOuterJoin(Outerjoin)
	 * @generated
	 */
	boolean isSetOuterJoin();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Persister()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='persister'"
	 * @generated
	 */
	String getPersister();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getPersister <em>Persister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persister</em>' attribute.
	 * @see #getPersister()
	 * @generated
	 */
	void setPersister(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Schema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schema'"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Subselect1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='subselect'"
	 * @generated
	 */
	String getSubselect1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getSubselect1 <em>Subselect1</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Table()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='table'"
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' attribute.
	 * @see #setWhere(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getPrimitiveArray_Where()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='where'"
	 * @generated
	 */
	String getWhere();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.PrimitiveArray#getWhere <em>Where</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' attribute.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(String value);

} // PrimitiveArray

/**
 * <copyright>
 * </copyright>
 *
 * $Id: SqlQuery.java,v 1.1 2010/08/18 09:25:26 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sql Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getReturnScalar <em>Return Scalar</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getReturn <em>Return</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getReturnJoin <em>Return Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getLoadCollection <em>Load Collection</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getSynchronize <em>Synchronize</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getQueryParam <em>Query Param</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCacheable <em>Cacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getCacheMode <em>Cache Mode</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getCacheRegion <em>Cache Region</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCallable <em>Callable</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getFetchSize <em>Fetch Size</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getFlushMode <em>Flush Mode</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getResultsetRef <em>Resultset Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery()
 * @model extendedMetaData="name='sql-query' kind='mixed'"
 * @generated
 */
public interface SqlQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Return Scalar</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.ReturnScalar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Scalar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Scalar</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_ReturnScalar()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='return-scalar' group='#group:1'"
	 * @generated
	 */
	EList<ReturnScalar> getReturnScalar();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Return}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_Return()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='return' group='#group:1'"
	 * @generated
	 */
	EList<Return> getReturn();

	/**
	 * Returns the value of the '<em><b>Return Join</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.ReturnJoin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Join</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Join</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_ReturnJoin()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='return-join' group='#group:1'"
	 * @generated
	 */
	EList<ReturnJoin> getReturnJoin();

	/**
	 * Returns the value of the '<em><b>Load Collection</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.LoadCollection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Collection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Collection</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_LoadCollection()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='load-collection' group='#group:1'"
	 * @generated
	 */
	EList<LoadCollection> getLoadCollection();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_Synchronize()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='synchronize' group='#group:1'"
	 * @generated
	 */
	EList<Synchronize> getSynchronize();

	/**
	 * Returns the value of the '<em><b>Query Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.QueryParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Param</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_QueryParam()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='query-param' group='#group:1'"
	 * @generated
	 */
	EList<QueryParam> getQueryParam();

	/**
	 * Returns the value of the '<em><b>Cacheable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cacheable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cacheable</em>' attribute.
	 * @see #isSetCacheable()
	 * @see #unsetCacheable()
	 * @see #setCacheable(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_Cacheable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='cacheable'"
	 * @generated
	 */
	boolean isCacheable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCacheable <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cacheable</em>' attribute.
	 * @see #isSetCacheable()
	 * @see #unsetCacheable()
	 * @see #isCacheable()
	 * @generated
	 */
	void setCacheable(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCacheable <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCacheable()
	 * @see #isCacheable()
	 * @see #setCacheable(boolean)
	 * @generated
	 */
	void unsetCacheable();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCacheable <em>Cacheable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cacheable</em>' attribute is set.
	 * @see #unsetCacheable()
	 * @see #isCacheable()
	 * @see #setCacheable(boolean)
	 * @generated
	 */
	boolean isSetCacheable();

	/**
	 * Returns the value of the '<em><b>Cache Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.Cachemode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Mode</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Cachemode
	 * @see #isSetCacheMode()
	 * @see #unsetCacheMode()
	 * @see #setCacheMode(Cachemode)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_CacheMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='cache-mode'"
	 * @generated
	 */
	Cachemode getCacheMode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getCacheMode <em>Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Mode</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Cachemode
	 * @see #isSetCacheMode()
	 * @see #unsetCacheMode()
	 * @see #getCacheMode()
	 * @generated
	 */
	void setCacheMode(Cachemode value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getCacheMode <em>Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCacheMode()
	 * @see #getCacheMode()
	 * @see #setCacheMode(Cachemode)
	 * @generated
	 */
	void unsetCacheMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getCacheMode <em>Cache Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cache Mode</em>' attribute is set.
	 * @see #unsetCacheMode()
	 * @see #getCacheMode()
	 * @see #setCacheMode(Cachemode)
	 * @generated
	 */
	boolean isSetCacheMode();

	/**
	 * Returns the value of the '<em><b>Cache Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Region</em>' attribute.
	 * @see #setCacheRegion(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_CacheRegion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cache-region'"
	 * @generated
	 */
	String getCacheRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getCacheRegion <em>Cache Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Region</em>' attribute.
	 * @see #getCacheRegion()
	 * @generated
	 */
	void setCacheRegion(String value);

	/**
	 * Returns the value of the '<em><b>Callable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callable</em>' attribute.
	 * @see #isSetCallable()
	 * @see #unsetCallable()
	 * @see #setCallable(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_Callable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='callable'"
	 * @generated
	 */
	boolean isCallable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCallable <em>Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callable</em>' attribute.
	 * @see #isSetCallable()
	 * @see #unsetCallable()
	 * @see #isCallable()
	 * @generated
	 */
	void setCallable(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCallable <em>Callable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCallable()
	 * @see #isCallable()
	 * @see #setCallable(boolean)
	 * @generated
	 */
	void unsetCallable();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isCallable <em>Callable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Callable</em>' attribute is set.
	 * @see #unsetCallable()
	 * @see #isCallable()
	 * @see #setCallable(boolean)
	 * @generated
	 */
	boolean isSetCallable();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Fetch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch Size</em>' attribute.
	 * @see #setFetchSize(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_FetchSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='fetch-size'"
	 * @generated
	 */
	String getFetchSize();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getFetchSize <em>Fetch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch Size</em>' attribute.
	 * @see #getFetchSize()
	 * @generated
	 */
	void setFetchSize(String value);

	/**
	 * Returns the value of the '<em><b>Flush Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.Flushmode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flush Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flush Mode</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Flushmode
	 * @see #isSetFlushMode()
	 * @see #unsetFlushMode()
	 * @see #setFlushMode(Flushmode)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_FlushMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='flush-mode'"
	 * @generated
	 */
	Flushmode getFlushMode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getFlushMode <em>Flush Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flush Mode</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Flushmode
	 * @see #isSetFlushMode()
	 * @see #unsetFlushMode()
	 * @see #getFlushMode()
	 * @generated
	 */
	void setFlushMode(Flushmode value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getFlushMode <em>Flush Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlushMode()
	 * @see #getFlushMode()
	 * @see #setFlushMode(Flushmode)
	 * @generated
	 */
	void unsetFlushMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getFlushMode <em>Flush Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flush Mode</em>' attribute is set.
	 * @see #unsetFlushMode()
	 * @see #getFlushMode()
	 * @see #setFlushMode(Flushmode)
	 * @generated
	 */
	boolean isSetFlushMode();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #isSetReadOnly()
	 * @see #unsetReadOnly()
	 * @see #setReadOnly(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_ReadOnly()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='read-only'"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isSetReadOnly()
	 * @see #unsetReadOnly()
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadOnly()
	 * @see #isReadOnly()
	 * @see #setReadOnly(boolean)
	 * @generated
	 */
	void unsetReadOnly();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#isReadOnly <em>Read Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Only</em>' attribute is set.
	 * @see #unsetReadOnly()
	 * @see #isReadOnly()
	 * @see #setReadOnly(boolean)
	 * @generated
	 */
	boolean isSetReadOnly();

	/**
	 * Returns the value of the '<em><b>Resultset Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resultset Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resultset Ref</em>' attribute.
	 * @see #setResultsetRef(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_ResultsetRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resultset-ref'"
	 * @generated
	 */
	String getResultsetRef();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getResultsetRef <em>Resultset Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resultset Ref</em>' attribute.
	 * @see #getResultsetRef()
	 * @generated
	 */
	void setResultsetRef(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getSqlQuery_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.SqlQuery#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

} // SqlQuery

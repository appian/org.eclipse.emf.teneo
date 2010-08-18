/**
 * <copyright>
 * </copyright>
 *
 * $Id: HibernateMapping.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hibernate Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getTypedef <em>Typedef</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getJoinedSubclass <em>Joined Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getUnionSubclass <em>Union Subclass</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getResultset <em>Resultset</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getQuery <em>Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getSqlQuery <em>Sql Query</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getFilterDef <em>Filter Def</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDatabaseObject <em>Database Object</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isAutoImport <em>Auto Import</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultAccess <em>Default Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultCascade <em>Default Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isDefaultLazy <em>Default Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getPackage <em>Package</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping()
 * @model extendedMetaData="name='hibernate-mapping' kind='elementOnly'"
 * @generated
 */
public interface HibernateMapping extends EObject {
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Meta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meta'"
	 * @generated
	 */
	EList<Meta> getMeta();

	/**
	 * Returns the value of the '<em><b>Typedef</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Typedef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typedef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typedef</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Typedef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typedef'"
	 * @generated
	 */
	EList<Typedef> getTypedef();

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Import()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='import'"
	 * @generated
	 */
	EList<Import> getImport();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Class()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='class' group='#group:3'"
	 * @generated
	 */
	EList<org.eclipse.emf.teneo.db2m.hbm30.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Subclass</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Subclass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Subclass()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subclass' group='#group:3'"
	 * @generated
	 */
	EList<Subclass> getSubclass();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_JoinedSubclass()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='joined-subclass' group='#group:3'"
	 * @generated
	 */
	EList<JoinedSubclass> getJoinedSubclass();

	/**
	 * Returns the value of the '<em><b>Union Subclass</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.UnionSubclass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union Subclass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union Subclass</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_UnionSubclass()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='union-subclass' group='#group:3'"
	 * @generated
	 */
	EList<UnionSubclass> getUnionSubclass();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Resultset()
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Group1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:9'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Query()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='query' group='#group:9'"
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_SqlQuery()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sql-query' group='#group:9'"
	 * @generated
	 */
	EList<SqlQuery> getSqlQuery();

	/**
	 * Returns the value of the '<em><b>Filter Def</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.FilterDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Def</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_FilterDef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='filter-def'"
	 * @generated
	 */
	EList<FilterDef> getFilterDef();

	/**
	 * Returns the value of the '<em><b>Database Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.DatabaseObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Object</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_DatabaseObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='database-object'"
	 * @generated
	 */
	EList<DatabaseObject> getDatabaseObject();

	/**
	 * Returns the value of the '<em><b>Auto Import</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Import</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Import</em>' attribute.
	 * @see #isSetAutoImport()
	 * @see #unsetAutoImport()
	 * @see #setAutoImport(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_AutoImport()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='auto-import'"
	 * @generated
	 */
	boolean isAutoImport();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isAutoImport <em>Auto Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Import</em>' attribute.
	 * @see #isSetAutoImport()
	 * @see #unsetAutoImport()
	 * @see #isAutoImport()
	 * @generated
	 */
	void setAutoImport(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isAutoImport <em>Auto Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoImport()
	 * @see #isAutoImport()
	 * @see #setAutoImport(boolean)
	 * @generated
	 */
	void unsetAutoImport();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isAutoImport <em>Auto Import</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Import</em>' attribute is set.
	 * @see #unsetAutoImport()
	 * @see #isAutoImport()
	 * @see #setAutoImport(boolean)
	 * @generated
	 */
	boolean isSetAutoImport();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Catalog()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='catalog'"
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Default Access</b></em>' attribute.
	 * The default value is <code>"property"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Access</em>' attribute.
	 * @see #isSetDefaultAccess()
	 * @see #unsetDefaultAccess()
	 * @see #setDefaultAccess(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_DefaultAccess()
	 * @model default="property" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default-access'"
	 * @generated
	 */
	String getDefaultAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultAccess <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Access</em>' attribute.
	 * @see #isSetDefaultAccess()
	 * @see #unsetDefaultAccess()
	 * @see #getDefaultAccess()
	 * @generated
	 */
	void setDefaultAccess(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultAccess <em>Default Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultAccess()
	 * @see #getDefaultAccess()
	 * @see #setDefaultAccess(String)
	 * @generated
	 */
	void unsetDefaultAccess();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultAccess <em>Default Access</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Access</em>' attribute is set.
	 * @see #unsetDefaultAccess()
	 * @see #getDefaultAccess()
	 * @see #setDefaultAccess(String)
	 * @generated
	 */
	boolean isSetDefaultAccess();

	/**
	 * Returns the value of the '<em><b>Default Cascade</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Cascade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Cascade</em>' attribute.
	 * @see #isSetDefaultCascade()
	 * @see #unsetDefaultCascade()
	 * @see #setDefaultCascade(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_DefaultCascade()
	 * @model default="none" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default-cascade'"
	 * @generated
	 */
	String getDefaultCascade();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultCascade <em>Default Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cascade</em>' attribute.
	 * @see #isSetDefaultCascade()
	 * @see #unsetDefaultCascade()
	 * @see #getDefaultCascade()
	 * @generated
	 */
	void setDefaultCascade(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultCascade <em>Default Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultCascade()
	 * @see #getDefaultCascade()
	 * @see #setDefaultCascade(String)
	 * @generated
	 */
	void unsetDefaultCascade();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getDefaultCascade <em>Default Cascade</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Cascade</em>' attribute is set.
	 * @see #unsetDefaultCascade()
	 * @see #getDefaultCascade()
	 * @see #setDefaultCascade(String)
	 * @generated
	 */
	boolean isSetDefaultCascade();

	/**
	 * Returns the value of the '<em><b>Default Lazy</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Lazy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Lazy</em>' attribute.
	 * @see #isSetDefaultLazy()
	 * @see #unsetDefaultLazy()
	 * @see #setDefaultLazy(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_DefaultLazy()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='default-lazy'"
	 * @generated
	 */
	boolean isDefaultLazy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isDefaultLazy <em>Default Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Lazy</em>' attribute.
	 * @see #isSetDefaultLazy()
	 * @see #unsetDefaultLazy()
	 * @see #isDefaultLazy()
	 * @generated
	 */
	void setDefaultLazy(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isDefaultLazy <em>Default Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultLazy()
	 * @see #isDefaultLazy()
	 * @see #setDefaultLazy(boolean)
	 * @generated
	 */
	void unsetDefaultLazy();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#isDefaultLazy <em>Default Lazy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Lazy</em>' attribute is set.
	 * @see #unsetDefaultLazy()
	 * @see #isDefaultLazy()
	 * @see #setDefaultLazy(boolean)
	 * @generated
	 */
	boolean isSetDefaultLazy();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Package()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='package'"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getHibernateMapping_Schema()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schema'"
	 * @generated
	 */
	String getSchema();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.HibernateMapping#getSchema <em>Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' attribute.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(String value);

} // HibernateMapping

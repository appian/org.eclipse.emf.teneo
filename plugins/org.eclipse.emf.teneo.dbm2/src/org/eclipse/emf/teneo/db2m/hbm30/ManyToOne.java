/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToOne.java,v 1.1 2010/08/18 09:21:40 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To One</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFormula <em>Formula</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getColumn1 <em>Column1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isEmbedXml <em>Embed Xml</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFormula1 <em>Formula1</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isInsert <em>Insert</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getLazy <em>Lazy</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getNotFound <em>Not Found</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isNotNull <em>Not Null</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isOptimisticLock <em>Optimistic Lock</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getOuterJoin <em>Outer Join</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getPropertyRef <em>Property Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getUniqueKey <em>Unique Key</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUpdate <em>Update</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne()
 * @model extendedMetaData="name='many-to-one' kind='elementOnly'"
 * @generated
 */
public interface ManyToOne extends EObject {
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Meta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meta'"
	 * @generated
	 */
	EList<Meta> getMeta();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.db2m.hbm30.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Column()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='column' group='#group:1'"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' attribute list.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Formula()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='formula' group='#group:1'"
	 * @generated
	 */
	EList<String> getFormula();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Access()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

	/**
	 * Returns the value of the '<em><b>Cascade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascade</em>' attribute.
	 * @see #setCascade(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Cascade()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cascade'"
	 * @generated
	 */
	String getCascade();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getCascade <em>Cascade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascade</em>' attribute.
	 * @see #getCascade()
	 * @generated
	 */
	void setCascade(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Column1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column1</em>' attribute.
	 * @see #setColumn1(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Column1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='column'"
	 * @generated
	 */
	String getColumn1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getColumn1 <em>Column1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column1</em>' attribute.
	 * @see #getColumn1()
	 * @generated
	 */
	void setColumn1(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_EmbedXml()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='embed-xml'"
	 * @generated
	 */
	boolean isEmbedXml();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isEmbedXml <em>Embed Xml</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isEmbedXml <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmbedXml()
	 * @see #isEmbedXml()
	 * @see #setEmbedXml(boolean)
	 * @generated
	 */
	void unsetEmbedXml();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isEmbedXml <em>Embed Xml</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Name</em>' attribute.
	 * @see #setEntityName(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_EntityName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='entity-name'"
	 * @generated
	 */
	String getEntityName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getEntityName <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Name</em>' attribute.
	 * @see #getEntityName()
	 * @generated
	 */
	void setEntityName(String value);

	/**
	 * Returns the value of the '<em><b>Fetch</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect
	 * @see #isSetFetch()
	 * @see #unsetFetch()
	 * @see #setFetch(FetchJoinSelect)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Fetch()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='fetch'"
	 * @generated
	 */
	FetchJoinSelect getFetch();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.FetchJoinSelect
	 * @see #isSetFetch()
	 * @see #unsetFetch()
	 * @see #getFetch()
	 * @generated
	 */
	void setFetch(FetchJoinSelect value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFetch <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFetch()
	 * @see #getFetch()
	 * @see #setFetch(FetchJoinSelect)
	 * @generated
	 */
	void unsetFetch();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFetch <em>Fetch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fetch</em>' attribute is set.
	 * @see #unsetFetch()
	 * @see #getFetch()
	 * @see #setFetch(FetchJoinSelect)
	 * @generated
	 */
	boolean isSetFetch();

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' attribute.
	 * @see #setForeignKey(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_ForeignKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='foreign-key'"
	 * @generated
	 */
	String getForeignKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getForeignKey <em>Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' attribute.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(String value);

	/**
	 * Returns the value of the '<em><b>Formula1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula1</em>' attribute.
	 * @see #setFormula1(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Formula1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='formula'"
	 * @generated
	 */
	String getFormula1();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getFormula1 <em>Formula1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula1</em>' attribute.
	 * @see #getFormula1()
	 * @generated
	 */
	void setFormula1(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Index()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='index'"
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Insert()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='insert'"
	 * @generated
	 */
	boolean isInsert();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isInsert <em>Insert</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isInsert <em>Insert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsert()
	 * @see #isInsert()
	 * @see #setInsert(boolean)
	 * @generated
	 */
	void unsetInsert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isInsert <em>Insert</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.Lazy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lazy</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lazy
	 * @see #isSetLazy()
	 * @see #unsetLazy()
	 * @see #setLazy(Lazy)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Lazy()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='lazy'"
	 * @generated
	 */
	Lazy getLazy();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Lazy
	 * @see #isSetLazy()
	 * @see #unsetLazy()
	 * @see #getLazy()
	 * @generated
	 */
	void setLazy(Lazy value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLazy()
	 * @see #getLazy()
	 * @see #setLazy(Lazy)
	 * @generated
	 */
	void unsetLazy();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getLazy <em>Lazy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lazy</em>' attribute is set.
	 * @see #unsetLazy()
	 * @see #getLazy()
	 * @see #setLazy(Lazy)
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Node()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='node'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(String value);

	/**
	 * Returns the value of the '<em><b>Not Found</b></em>' attribute.
	 * The default value is <code>"exception"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.db2m.hbm30.Notfound}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Found</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Found</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Notfound
	 * @see #isSetNotFound()
	 * @see #unsetNotFound()
	 * @see #setNotFound(Notfound)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_NotFound()
	 * @model default="exception" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='not-found'"
	 * @generated
	 */
	Notfound getNotFound();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getNotFound <em>Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Found</em>' attribute.
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Notfound
	 * @see #isSetNotFound()
	 * @see #unsetNotFound()
	 * @see #getNotFound()
	 * @generated
	 */
	void setNotFound(Notfound value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getNotFound <em>Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotFound()
	 * @see #getNotFound()
	 * @see #setNotFound(Notfound)
	 * @generated
	 */
	void unsetNotFound();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getNotFound <em>Not Found</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Not Found</em>' attribute is set.
	 * @see #unsetNotFound()
	 * @see #getNotFound()
	 * @see #setNotFound(Notfound)
	 * @generated
	 */
	boolean isSetNotFound();

	/**
	 * Returns the value of the '<em><b>Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Null</em>' attribute.
	 * @see #isSetNotNull()
	 * @see #unsetNotNull()
	 * @see #setNotNull(boolean)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_NotNull()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='not-null'"
	 * @generated
	 */
	boolean isNotNull();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Null</em>' attribute.
	 * @see #isSetNotNull()
	 * @see #unsetNotNull()
	 * @see #isNotNull()
	 * @generated
	 */
	void setNotNull(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isNotNull <em>Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotNull()
	 * @see #isNotNull()
	 * @see #setNotNull(boolean)
	 * @generated
	 */
	void unsetNotNull();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isNotNull <em>Not Null</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Not Null</em>' attribute is set.
	 * @see #unsetNotNull()
	 * @see #isNotNull()
	 * @see #setNotNull(boolean)
	 * @generated
	 */
	boolean isSetNotNull();

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_OptimisticLock()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='optimistic-lock'"
	 * @generated
	 */
	boolean isOptimisticLock();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isOptimisticLock <em>Optimistic Lock</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isOptimisticLock <em>Optimistic Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptimisticLock()
	 * @see #isOptimisticLock()
	 * @see #setOptimisticLock(boolean)
	 * @generated
	 */
	void unsetOptimisticLock();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isOptimisticLock <em>Optimistic Lock</em>}' attribute is set.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_OuterJoin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='outer-join'"
	 * @generated
	 */
	Outerjoin getOuterJoin();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getOuterJoin <em>Outer Join</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getOuterJoin <em>Outer Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOuterJoin()
	 * @see #getOuterJoin()
	 * @see #setOuterJoin(Outerjoin)
	 * @generated
	 */
	void unsetOuterJoin();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getOuterJoin <em>Outer Join</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Ref</em>' attribute.
	 * @see #setPropertyRef(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_PropertyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='property-ref'"
	 * @generated
	 */
	String getPropertyRef();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getPropertyRef <em>Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Ref</em>' attribute.
	 * @see #getPropertyRef()
	 * @generated
	 */
	void setPropertyRef(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Unique()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='unique'"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUnique <em>Unique</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnique()
	 * @see #isUnique()
	 * @see #setUnique(boolean)
	 * @generated
	 */
	void unsetUnique();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUnique <em>Unique</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Unique Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Key</em>' attribute.
	 * @see #setUniqueKey(String)
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_UniqueKey()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='unique-key'"
	 * @generated
	 */
	String getUniqueKey();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#getUniqueKey <em>Unique Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Key</em>' attribute.
	 * @see #getUniqueKey()
	 * @generated
	 */
	void setUniqueKey(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getManyToOne_Update()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='update'"
	 * @generated
	 */
	boolean isUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUpdate <em>Update</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUpdate()
	 * @see #isUpdate()
	 * @see #setUpdate(boolean)
	 * @generated
	 */
	void unsetUpdate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.ManyToOne#isUpdate <em>Update</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Update</em>' attribute is set.
	 * @see #unsetUpdate()
	 * @see #isUpdate()
	 * @see #setUpdate(boolean)
	 * @generated
	 */
	boolean isSetUpdate();

} // ManyToOne

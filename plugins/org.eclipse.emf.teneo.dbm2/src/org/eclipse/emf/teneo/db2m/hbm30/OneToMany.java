/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToMany.java,v 1.1 2010/08/18 09:25:25 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One To Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#isEmbedXml <em>Embed Xml</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getNotFound <em>Not Found</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getOneToMany()
 * @model extendedMetaData="name='one-to-many' kind='empty'"
 * @generated
 */
public interface OneToMany extends EObject {
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getOneToMany_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getOneToMany_EmbedXml()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='embed-xml'"
	 * @generated
	 */
	boolean isEmbedXml();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#isEmbedXml <em>Embed Xml</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#isEmbedXml <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEmbedXml()
	 * @see #isEmbedXml()
	 * @see #setEmbedXml(boolean)
	 * @generated
	 */
	void unsetEmbedXml();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#isEmbedXml <em>Embed Xml</em>}' attribute is set.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getOneToMany_EntityName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='entity-name'"
	 * @generated
	 */
	String getEntityName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getEntityName <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Name</em>' attribute.
	 * @see #getEntityName()
	 * @generated
	 */
	void setEntityName(String value);

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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getOneToMany_Node()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='node'"
	 * @generated
	 */
	String getNode();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getNode <em>Node</em>}' attribute.
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
	 * @see org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package#getOneToMany_NotFound()
	 * @model default="exception" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='not-found'"
	 * @generated
	 */
	Notfound getNotFound();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getNotFound <em>Not Found</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getNotFound <em>Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotFound()
	 * @see #getNotFound()
	 * @see #setNotFound(Notfound)
	 * @generated
	 */
	void unsetNotFound();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.db2m.hbm30.OneToMany#getNotFound <em>Not Found</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Not Found</em>' attribute is set.
	 * @see #unsetNotFound()
	 * @see #getNotFound()
	 * @see #setNotFound(Notfound)
	 * @generated
	 */
	boolean isSetNotFound();

} // OneToMany

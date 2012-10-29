/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Domain</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.Domain#getName <em>Name</em>}</li>
 * <li>{@link lobj.Domain#getDescription <em>Description</em>}</li>
 * <li>{@link lobj.Domain#getBlocktypes <em>Blocktypes</em>}</li>
 * <li>{@link lobj.Domain#getCreationDate <em>Creation Date</em>}</li>
 * <li>{@link lobj.Domain#getServerURL <em>Server URL</em>}</li>
 * <li>{@link lobj.Domain#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getDomain()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lobj.LobjPackage#getDomain_Name()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lobj.Domain#getName <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see lobj.LobjPackage#getDomain_Description()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link lobj.Domain#getDescription <em>Description</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Blocktypes</b></em>' reference list. The list contents are of
	 * type {@link lobj.Blocktype}. It is bidirectional and its opposite is '
	 * {@link lobj.Blocktype#getDomains <em>Domains</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocktypes</em>' reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Blocktypes</em>' reference list.
	 * @see lobj.LobjPackage#getDomain_Blocktypes()
	 * @see lobj.Blocktype#getDomains
	 * @model type="lobj.Blocktype" opposite="domains"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getBlocktypes();

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see lobj.LobjPackage#getDomain_CreationDate()
	 * @model unique="false" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link lobj.Domain#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Server URL</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server URL</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Server URL</em>' attribute.
	 * @see #setServerURL(String)
	 * @see lobj.LobjPackage#getDomain_ServerURL()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getServerURL();

	/**
	 * Sets the value of the '{@link lobj.Domain#getServerURL <em>Server URL</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Server URL</em>' attribute.
	 * @see #getServerURL()
	 * @generated
	 */
	void setServerURL(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getDomain_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.Domain#getId <em>Id</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Domain

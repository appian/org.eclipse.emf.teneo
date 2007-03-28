/**
 * <copyright>
 * </copyright>
 *
 * $Id: Blocktype.java,v 1.3 2007/03/28 13:56:50 mtaal Exp $
 */
package lobj;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blocktype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.Blocktype#getName <em>Name</em>}</li>
 *   <li>{@link lobj.Blocktype#getDescription <em>Description</em>}</li>
 *   <li>{@link lobj.Blocktype#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link lobj.Blocktype#getStyleRef <em>Style Ref</em>}</li>
 *   <li>{@link lobj.Blocktype#getDomains <em>Domains</em>}</li>
 *   <li>{@link lobj.Blocktype#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getBlocktype()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Blocktype extends EObject {
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
	 * @see lobj.LobjPackage#getBlocktype_Name()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lobj.Blocktype#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see lobj.LobjPackage#getBlocktype_Description()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link lobj.Blocktype#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see lobj.LobjPackage#getBlocktype_CreationDate()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link lobj.Blocktype#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Style Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Ref</em>' attribute.
	 * @see #setStyleRef(String)
	 * @see lobj.LobjPackage#getBlocktype_StyleRef()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getStyleRef();

	/**
	 * Sets the value of the '{@link lobj.Blocktype#getStyleRef <em>Style Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Ref</em>' attribute.
	 * @see #getStyleRef()
	 * @generated
	 */
	void setStyleRef(String value);

	/**
	 * Returns the value of the '<em><b>Domains</b></em>' reference list.
	 * The list contents are of type {@link lobj.Domain}.
	 * It is bidirectional and its opposite is '{@link lobj.Domain#getBlocktypes <em>Blocktypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' reference list.
	 * @see lobj.LobjPackage#getBlocktype_Domains()
	 * @see lobj.Domain#getBlocktypes
	 * @model type="lobj.Domain" opposite="blocktypes"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getDomains();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see lobj.LobjPackage#getBlocktype_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.Blocktype#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Blocktype

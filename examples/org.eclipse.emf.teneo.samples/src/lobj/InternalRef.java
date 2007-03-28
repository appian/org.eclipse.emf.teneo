/**
 * <copyright>
 * </copyright>
 *
 * $Id: InternalRef.java,v 1.3 2007/03/28 13:56:49 mtaal Exp $
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.InternalRef#getLanguage <em>Language</em>}</li>
 *   <li>{@link lobj.InternalRef#getRef <em>Ref</em>}</li>
 *   <li>{@link lobj.InternalRef#getFile <em>File</em>}</li>
 *   <li>{@link lobj.InternalRef#getReftype <em>Reftype</em>}</li>
 *   <li>{@link lobj.InternalRef#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getInternalRef()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface InternalRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' reference.
	 * @see #setLanguage(Language)
	 * @see lobj.LobjPackage#getInternalRef_Language()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link lobj.InternalRef#getLanguage <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see lobj.LobjPackage#getInternalRef_Ref()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link lobj.InternalRef#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see lobj.LobjPackage#getInternalRef_File()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link lobj.InternalRef#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Reftype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reftype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reftype</em>' attribute.
	 * @see #setReftype(String)
	 * @see lobj.LobjPackage#getInternalRef_Reftype()
	 * @model extendedMetaData="kind='element'"
	 * @generated
	 */
	String getReftype();

	/**
	 * Sets the value of the '{@link lobj.InternalRef#getReftype <em>Reftype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reftype</em>' attribute.
	 * @see #getReftype()
	 * @generated
	 */
	void setReftype(String value);

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
	 * @see lobj.LobjPackage#getInternalRef_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.InternalRef#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // InternalRef

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lu Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.LuMeta#getDidacMeta <em>Didac Meta</em>}</li>
 *   <li>{@link lobj.LuMeta#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link lobj.LuMeta#getDomain <em>Domain</em>}</li>
 *   <li>{@link lobj.LuMeta#getAuthors <em>Authors</em>}</li>
 *   <li>{@link lobj.LuMeta#getPublishInfo <em>Publish Info</em>}</li>
 *   <li>{@link lobj.LuMeta#getDefLang <em>Def Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getLuMeta()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface LuMeta extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Didac Meta</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.DidacMeta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Didac Meta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Didac Meta</em>' containment reference list.
	 * @see lobj.LobjPackage#getLuMeta_DidacMeta()
	 * @model type="lobj.DidacMeta" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getDidacMeta();

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
	 * @see lobj.LobjPackage#getLuMeta_CreationDate()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link lobj.LuMeta#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(Domain)
	 * @see lobj.LobjPackage#getLuMeta_Domain()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link lobj.LuMeta#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list.
	 * The list contents are of type {@link lobj.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see lobj.LobjPackage#getLuMeta_Authors()
	 * @model type="lobj.Author" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getAuthors();

	/**
	 * Returns the value of the '<em><b>Publish Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish Info</em>' containment reference.
	 * @see #setPublishInfo(PublishInfo)
	 * @see lobj.LobjPackage#getLuMeta_PublishInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishInfo getPublishInfo();

	/**
	 * Sets the value of the '{@link lobj.LuMeta#getPublishInfo <em>Publish Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish Info</em>' containment reference.
	 * @see #getPublishInfo()
	 * @generated
	 */
	void setPublishInfo(PublishInfo value);

	/**
	 * Returns the value of the '<em><b>Def Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Lang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Lang</em>' reference.
	 * @see #setDefLang(Language)
	 * @see lobj.LobjPackage#getLuMeta_DefLang()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	Language getDefLang();

	/**
	 * Sets the value of the '{@link lobj.LuMeta#getDefLang <em>Def Lang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Lang</em>' reference.
	 * @see #getDefLang()
	 * @generated
	 */
	void setDefLang(Language value);

} // LuMeta

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
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Module Meta</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.ModuleMeta#getDidacMeta <em>Didac Meta</em>}</li>
 * <li>{@link lobj.ModuleMeta#getCreationDate <em>Creation Date</em>}</li>
 * <li>{@link lobj.ModuleMeta#getAuthors <em>Authors</em>}</li>
 * <li>{@link lobj.ModuleMeta#getPublishInfo <em>Publish Info</em>}</li>
 * <li>{@link lobj.ModuleMeta#getDefLang <em>Def Lang</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getModuleMeta()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface ModuleMeta extends LearningObject {
	/**
	 * Returns the value of the '<em><b>Didac Meta</b></em>' containment reference list. The list
	 * contents are of type {@link lobj.DidacMeta}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Didac Meta</em>' containment reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Didac Meta</em>' containment reference list.
	 * @see lobj.LobjPackage#getModuleMeta_DidacMeta()
	 * @model type="lobj.DidacMeta" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getDidacMeta();

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
	 * @see lobj.LobjPackage#getModuleMeta_CreationDate()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link lobj.ModuleMeta#getCreationDate <em>Creation Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' containment reference list. The list
	 * contents are of type {@link lobj.Author}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Authors</em>' containment reference list.
	 * @see lobj.LobjPackage#getModuleMeta_Authors()
	 * @model type="lobj.Author" containment="true"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getAuthors();

	/**
	 * Returns the value of the '<em><b>Publish Info</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish Info</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Publish Info</em>' containment reference.
	 * @see #setPublishInfo(PublishInfo)
	 * @see lobj.LobjPackage#getModuleMeta_PublishInfo()
	 * @model containment="true" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishInfo getPublishInfo();

	/**
	 * Sets the value of the '{@link lobj.ModuleMeta#getPublishInfo <em>Publish Info</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Publish Info</em>' containment reference.
	 * @see #getPublishInfo()
	 * @generated
	 */
	void setPublishInfo(PublishInfo value);

	/**
	 * Returns the value of the '<em><b>Def Lang</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Lang</em>' reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Def Lang</em>' reference.
	 * @see #setDefLang(Language)
	 * @see lobj.LobjPackage#getModuleMeta_DefLang()
	 * @model extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	Language getDefLang();

	/**
	 * Sets the value of the '{@link lobj.ModuleMeta#getDefLang <em>Def Lang</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Def Lang</em>' reference.
	 * @see #getDefLang()
	 * @generated
	 */
	void setDefLang(Language value);

} // ModuleMeta

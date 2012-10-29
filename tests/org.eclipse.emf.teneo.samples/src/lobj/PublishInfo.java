/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Publish Info</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.PublishInfo#getEdition <em>Edition</em>}</li>
 * <li>{@link lobj.PublishInfo#getPubdate <em>Pubdate</em>}</li>
 * <li>{@link lobj.PublishInfo#getPublisher <em>Publisher</em>}</li>
 * <li>{@link lobj.PublishInfo#getPubsnumber <em>Pubsnumber</em>}</li>
 * <li>{@link lobj.PublishInfo#getReleaseinfo <em>Releaseinfo</em>}</li>
 * <li>{@link lobj.PublishInfo#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getPublishInfo()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface PublishInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Edition</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edition</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Edition</em>' attribute.
	 * @see #setEdition(String)
	 * @see lobj.LobjPackage#getPublishInfo_Edition()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getEdition();

	/**
	 * Sets the value of the '{@link lobj.PublishInfo#getEdition <em>Edition</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Edition</em>' attribute.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(String value);

	/**
	 * Returns the value of the '<em><b>Pubdate</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pubdate</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pubdate</em>' attribute.
	 * @see #setPubdate(Date)
	 * @see lobj.LobjPackage#getPublishInfo_Pubdate()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getPubdate();

	/**
	 * Sets the value of the '{@link lobj.PublishInfo#getPubdate <em>Pubdate</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Pubdate</em>' attribute.
	 * @see #getPubdate()
	 * @generated
	 */
	void setPubdate(Date value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(Publisher)
	 * @see lobj.LobjPackage#getPublishInfo_Publisher()
	 * @model containment="true" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Publisher getPublisher();

	/**
	 * Sets the value of the '{@link lobj.PublishInfo#getPublisher <em>Publisher</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Publisher value);

	/**
	 * Returns the value of the '<em><b>Pubsnumber</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pubsnumber</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pubsnumber</em>' attribute.
	 * @see #setPubsnumber(String)
	 * @see lobj.LobjPackage#getPublishInfo_Pubsnumber()
	 * @model unique="false" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPubsnumber();

	/**
	 * Sets the value of the '{@link lobj.PublishInfo#getPubsnumber <em>Pubsnumber</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Pubsnumber</em>' attribute.
	 * @see #getPubsnumber()
	 * @generated
	 */
	void setPubsnumber(String value);

	/**
	 * Returns the value of the '<em><b>Releaseinfo</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Releaseinfo</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Releaseinfo</em>' attribute.
	 * @see #setReleaseinfo(String)
	 * @see lobj.LobjPackage#getPublishInfo_Releaseinfo()
	 * @model unique="false" extendedMetaData="kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReleaseinfo();

	/**
	 * Sets the value of the '{@link lobj.PublishInfo#getReleaseinfo <em>Releaseinfo</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Releaseinfo</em>' attribute.
	 * @see #getReleaseinfo()
	 * @generated
	 */
	void setReleaseinfo(String value);

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
	 * @see lobj.LobjPackage#getPublishInfo_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.PublishInfo#getId <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PublishInfo

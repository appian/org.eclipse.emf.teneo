/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Affiliation</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link lobj.Affiliation#getShortaffil <em>Shortaffil</em>}</li>
 * <li>{@link lobj.Affiliation#getJobtitle <em>Jobtitle</em>}</li>
 * <li>{@link lobj.Affiliation#getOrgname <em>Orgname</em>}</li>
 * <li>{@link lobj.Affiliation#getOrgdiv <em>Orgdiv</em>}</li>
 * <li>{@link lobj.Affiliation#getAddress <em>Address</em>}</li>
 * <li>{@link lobj.Affiliation#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @see lobj.LobjPackage#getAffiliation()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Affiliation extends EObject {
	/**
	 * Returns the value of the '<em><b>Shortaffil</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shortaffil</em>' attribute isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Shortaffil</em>' attribute.
	 * @see #setShortaffil(String)
	 * @see lobj.LobjPackage#getAffiliation_Shortaffil()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getShortaffil();

	/**
	 * Sets the value of the '{@link lobj.Affiliation#getShortaffil <em>Shortaffil</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Shortaffil</em>' attribute.
	 * @see #getShortaffil()
	 * @generated
	 */
	void setShortaffil(String value);

	/**
	 * Returns the value of the '<em><b>Jobtitle</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jobtitle</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Jobtitle</em>' attribute.
	 * @see #setJobtitle(String)
	 * @see lobj.LobjPackage#getAffiliation_Jobtitle()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getJobtitle();

	/**
	 * Sets the value of the '{@link lobj.Affiliation#getJobtitle <em>Jobtitle</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Jobtitle</em>' attribute.
	 * @see #getJobtitle()
	 * @generated
	 */
	void setJobtitle(String value);

	/**
	 * Returns the value of the '<em><b>Orgname</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orgname</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Orgname</em>' attribute.
	 * @see #setOrgname(String)
	 * @see lobj.LobjPackage#getAffiliation_Orgname()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getOrgname();

	/**
	 * Sets the value of the '{@link lobj.Affiliation#getOrgname <em>Orgname</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Orgname</em>' attribute.
	 * @see #getOrgname()
	 * @generated
	 */
	void setOrgname(String value);

	/**
	 * Returns the value of the '<em><b>Orgdiv</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orgdiv</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Orgdiv</em>' attribute.
	 * @see #setOrgdiv(String)
	 * @see lobj.LobjPackage#getAffiliation_Orgdiv()
	 * @model unique="false" extendedMetaData="kind='element'"
	 * @generated
	 */
	String getOrgdiv();

	/**
	 * Sets the value of the '{@link lobj.Affiliation#getOrgdiv <em>Orgdiv</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Orgdiv</em>' attribute.
	 * @see #getOrgdiv()
	 * @generated
	 */
	void setOrgdiv(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Address)
	 * @see lobj.LobjPackage#getAffiliation_Address()
	 * @model containment="true" extendedMetaData="kind='element'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link lobj.Affiliation#getAddress <em>Address</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

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
	 * @see lobj.LobjPackage#getAffiliation_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.Affiliation#getId <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Affiliation

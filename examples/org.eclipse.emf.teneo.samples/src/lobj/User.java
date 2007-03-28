/**
 * <copyright>
 * </copyright>
 *
 * $Id: User.java,v 1.3 2007/03/28 13:56:50 mtaal Exp $
 */
package lobj;

import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lobj.User#getLoginname <em>Loginname</em>}</li>
 *   <li>{@link lobj.User#getPassword <em>Password</em>}</li>
 *   <li>{@link lobj.User#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link lobj.User#getLastname <em>Lastname</em>}</li>
 *   <li>{@link lobj.User#getMatriculationnr <em>Matriculationnr</em>}</li>
 *   <li>{@link lobj.User#getScn <em>Scn</em>}</li>
 *   <li>{@link lobj.User#getIcqnumber <em>Icqnumber</em>}</li>
 *   <li>{@link lobj.User#getIcqpassword <em>Icqpassword</em>}</li>
 *   <li>{@link lobj.User#getEntryasxml <em>Entryasxml</em>}</li>
 *   <li>{@link lobj.User#getLanguagenr <em>Languagenr</em>}</li>
 *   <li>{@link lobj.User#getNotificationprofileasxml <em>Notificationprofileasxml</em>}</li>
 *   <li>{@link lobj.User#getDossierasxml <em>Dossierasxml</em>}</li>
 *   <li>{@link lobj.User#getPhoto <em>Photo</em>}</li>
 *   <li>{@link lobj.User#getOnlinestatus <em>Onlinestatus</em>}</li>
 *   <li>{@link lobj.User#getOnlinedate <em>Onlinedate</em>}</li>
 *   <li>{@link lobj.User#getDatafilter <em>Datafilter</em>}</li>
 *   <li>{@link lobj.User#getInchatsince <em>Inchatsince</em>}</li>
 *   <li>{@link lobj.User#getContchatdate <em>Contchatdate</em>}</li>
 *   <li>{@link lobj.User#getChatroomnr <em>Chatroomnr</em>}</li>
 *   <li>{@link lobj.User#getFromext <em>Fromext</em>}</li>
 *   <li>{@link lobj.User#getLastlogindate <em>Lastlogindate</em>}</li>
 *   <li>{@link lobj.User#getCurrlogindate <em>Currlogindate</em>}</li>
 *   <li>{@link lobj.User#getLastcoursematerialnr <em>Lastcoursematerialnr</em>}</li>
 *   <li>{@link lobj.User#getLastcoursematerialviewnr <em>Lastcoursematerialviewnr</em>}</li>
 *   <li>{@link lobj.User#getAuthenticateldap <em>Authenticateldap</em>}</li>
 *   <li>{@link lobj.User#getPhotochanged <em>Photochanged</em>}</li>
 *   <li>{@link lobj.User#getAuthorizations <em>Authorizations</em>}</li>
 *   <li>{@link lobj.User#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see lobj.LobjPackage#getUser()
 * @model extendedMetaData="kind='elementOnly'"
 *        annotation="http://annotation.elver.org/Table name='member'"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Loginname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loginname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loginname</em>' attribute.
	 * @see #setLoginname(String)
	 * @see lobj.LobjPackage#getUser_Loginname()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getLoginname();

	/**
	 * Sets the value of the '{@link lobj.User#getLoginname <em>Loginname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loginname</em>' attribute.
	 * @see #getLoginname()
	 * @generated
	 */
	void setLoginname(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see lobj.LobjPackage#getUser_Password()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link lobj.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see lobj.LobjPackage#getUser_Firstname()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link lobj.User#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see lobj.LobjPackage#getUser_Lastname()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link lobj.User#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Matriculationnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matriculationnr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matriculationnr</em>' attribute.
	 * @see #setMatriculationnr(String)
	 * @see lobj.LobjPackage#getUser_Matriculationnr()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getMatriculationnr();

	/**
	 * Sets the value of the '{@link lobj.User#getMatriculationnr <em>Matriculationnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matriculationnr</em>' attribute.
	 * @see #getMatriculationnr()
	 * @generated
	 */
	void setMatriculationnr(String value);

	/**
	 * Returns the value of the '<em><b>Scn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scn</em>' attribute.
	 * @see #setScn(String)
	 * @see lobj.LobjPackage#getUser_Scn()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getScn();

	/**
	 * Sets the value of the '{@link lobj.User#getScn <em>Scn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scn</em>' attribute.
	 * @see #getScn()
	 * @generated
	 */
	void setScn(String value);

	/**
	 * Returns the value of the '<em><b>Icqnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icqnumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icqnumber</em>' attribute.
	 * @see #setIcqnumber(String)
	 * @see lobj.LobjPackage#getUser_Icqnumber()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getIcqnumber();

	/**
	 * Sets the value of the '{@link lobj.User#getIcqnumber <em>Icqnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icqnumber</em>' attribute.
	 * @see #getIcqnumber()
	 * @generated
	 */
	void setIcqnumber(String value);

	/**
	 * Returns the value of the '<em><b>Icqpassword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icqpassword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icqpassword</em>' attribute.
	 * @see #setIcqpassword(String)
	 * @see lobj.LobjPackage#getUser_Icqpassword()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getIcqpassword();

	/**
	 * Sets the value of the '{@link lobj.User#getIcqpassword <em>Icqpassword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icqpassword</em>' attribute.
	 * @see #getIcqpassword()
	 * @generated
	 */
	void setIcqpassword(String value);

	/**
	 * Returns the value of the '<em><b>Entryasxml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entryasxml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entryasxml</em>' attribute.
	 * @see #setEntryasxml(String)
	 * @see lobj.LobjPackage#getUser_Entryasxml()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getEntryasxml();

	/**
	 * Sets the value of the '{@link lobj.User#getEntryasxml <em>Entryasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entryasxml</em>' attribute.
	 * @see #getEntryasxml()
	 * @generated
	 */
	void setEntryasxml(String value);

	/**
	 * Returns the value of the '<em><b>Languagenr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languagenr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languagenr</em>' attribute.
	 * @see #setLanguagenr(String)
	 * @see lobj.LobjPackage#getUser_Languagenr()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getLanguagenr();

	/**
	 * Sets the value of the '{@link lobj.User#getLanguagenr <em>Languagenr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Languagenr</em>' attribute.
	 * @see #getLanguagenr()
	 * @generated
	 */
	void setLanguagenr(String value);

	/**
	 * Returns the value of the '<em><b>Notificationprofileasxml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notificationprofileasxml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notificationprofileasxml</em>' attribute.
	 * @see #setNotificationprofileasxml(String)
	 * @see lobj.LobjPackage#getUser_Notificationprofileasxml()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getNotificationprofileasxml();

	/**
	 * Sets the value of the '{@link lobj.User#getNotificationprofileasxml <em>Notificationprofileasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notificationprofileasxml</em>' attribute.
	 * @see #getNotificationprofileasxml()
	 * @generated
	 */
	void setNotificationprofileasxml(String value);

	/**
	 * Returns the value of the '<em><b>Dossierasxml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dossierasxml</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dossierasxml</em>' attribute.
	 * @see #setDossierasxml(String)
	 * @see lobj.LobjPackage#getUser_Dossierasxml()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getDossierasxml();

	/**
	 * Sets the value of the '{@link lobj.User#getDossierasxml <em>Dossierasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dossierasxml</em>' attribute.
	 * @see #getDossierasxml()
	 * @generated
	 */
	void setDossierasxml(String value);

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo</em>' attribute.
	 * @see #setPhoto(byte[])
	 * @see lobj.LobjPackage#getUser_Photo()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Base64Binary"
	 *        extendedMetaData="kind='element'"
	 *        annotation="http://annotation.elver.org/Column length='64000'"
	 * @generated
	 */
	byte[] getPhoto();

	/**
	 * Sets the value of the '{@link lobj.User#getPhoto <em>Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo</em>' attribute.
	 * @see #getPhoto()
	 * @generated
	 */
	void setPhoto(byte[] value);

	/**
	 * Returns the value of the '<em><b>Onlinestatus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onlinestatus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onlinestatus</em>' attribute.
	 * @see #setOnlinestatus(String)
	 * @see lobj.LobjPackage#getUser_Onlinestatus()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getOnlinestatus();

	/**
	 * Sets the value of the '{@link lobj.User#getOnlinestatus <em>Onlinestatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onlinestatus</em>' attribute.
	 * @see #getOnlinestatus()
	 * @generated
	 */
	void setOnlinestatus(String value);

	/**
	 * Returns the value of the '<em><b>Onlinedate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onlinedate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onlinedate</em>' attribute.
	 * @see #setOnlinedate(Date)
	 * @see lobj.LobjPackage#getUser_Onlinedate()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getOnlinedate();

	/**
	 * Sets the value of the '{@link lobj.User#getOnlinedate <em>Onlinedate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onlinedate</em>' attribute.
	 * @see #getOnlinedate()
	 * @generated
	 */
	void setOnlinedate(Date value);

	/**
	 * Returns the value of the '<em><b>Datafilter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datafilter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datafilter</em>' attribute.
	 * @see #setDatafilter(String)
	 * @see lobj.LobjPackage#getUser_Datafilter()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getDatafilter();

	/**
	 * Sets the value of the '{@link lobj.User#getDatafilter <em>Datafilter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datafilter</em>' attribute.
	 * @see #getDatafilter()
	 * @generated
	 */
	void setDatafilter(String value);

	/**
	 * Returns the value of the '<em><b>Inchatsince</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inchatsince</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inchatsince</em>' attribute.
	 * @see #setInchatsince(Date)
	 * @see lobj.LobjPackage#getUser_Inchatsince()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getInchatsince();

	/**
	 * Sets the value of the '{@link lobj.User#getInchatsince <em>Inchatsince</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inchatsince</em>' attribute.
	 * @see #getInchatsince()
	 * @generated
	 */
	void setInchatsince(Date value);

	/**
	 * Returns the value of the '<em><b>Contchatdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contchatdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contchatdate</em>' attribute.
	 * @see #setContchatdate(Date)
	 * @see lobj.LobjPackage#getUser_Contchatdate()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getContchatdate();

	/**
	 * Sets the value of the '{@link lobj.User#getContchatdate <em>Contchatdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contchatdate</em>' attribute.
	 * @see #getContchatdate()
	 * @generated
	 */
	void setContchatdate(Date value);

	/**
	 * Returns the value of the '<em><b>Chatroomnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chatroomnr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chatroomnr</em>' attribute.
	 * @see #setChatroomnr(BigInteger)
	 * @see lobj.LobjPackage#getUser_Chatroomnr()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	BigInteger getChatroomnr();

	/**
	 * Sets the value of the '{@link lobj.User#getChatroomnr <em>Chatroomnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chatroomnr</em>' attribute.
	 * @see #getChatroomnr()
	 * @generated
	 */
	void setChatroomnr(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fromext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fromext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fromext</em>' attribute.
	 * @see #setFromext(BigInteger)
	 * @see lobj.LobjPackage#getUser_Fromext()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	BigInteger getFromext();

	/**
	 * Sets the value of the '{@link lobj.User#getFromext <em>Fromext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fromext</em>' attribute.
	 * @see #getFromext()
	 * @generated
	 */
	void setFromext(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Lastlogindate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastlogindate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastlogindate</em>' attribute.
	 * @see #setLastlogindate(Date)
	 * @see lobj.LobjPackage#getUser_Lastlogindate()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getLastlogindate();

	/**
	 * Sets the value of the '{@link lobj.User#getLastlogindate <em>Lastlogindate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastlogindate</em>' attribute.
	 * @see #getLastlogindate()
	 * @generated
	 */
	void setLastlogindate(Date value);

	/**
	 * Returns the value of the '<em><b>Currlogindate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currlogindate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currlogindate</em>' attribute.
	 * @see #setCurrlogindate(Date)
	 * @see lobj.LobjPackage#getUser_Currlogindate()
	 * @model unique="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Date getCurrlogindate();

	/**
	 * Sets the value of the '{@link lobj.User#getCurrlogindate <em>Currlogindate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currlogindate</em>' attribute.
	 * @see #getCurrlogindate()
	 * @generated
	 */
	void setCurrlogindate(Date value);

	/**
	 * Returns the value of the '<em><b>Lastcoursematerialnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastcoursematerialnr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastcoursematerialnr</em>' attribute.
	 * @see #setLastcoursematerialnr(BigInteger)
	 * @see lobj.LobjPackage#getUser_Lastcoursematerialnr()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	BigInteger getLastcoursematerialnr();

	/**
	 * Sets the value of the '{@link lobj.User#getLastcoursematerialnr <em>Lastcoursematerialnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastcoursematerialnr</em>' attribute.
	 * @see #getLastcoursematerialnr()
	 * @generated
	 */
	void setLastcoursematerialnr(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Lastcoursematerialviewnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastcoursematerialviewnr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastcoursematerialviewnr</em>' attribute.
	 * @see #setLastcoursematerialviewnr(BigInteger)
	 * @see lobj.LobjPackage#getUser_Lastcoursematerialviewnr()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	BigInteger getLastcoursematerialviewnr();

	/**
	 * Sets the value of the '{@link lobj.User#getLastcoursematerialviewnr <em>Lastcoursematerialviewnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastcoursematerialviewnr</em>' attribute.
	 * @see #getLastcoursematerialviewnr()
	 * @generated
	 */
	void setLastcoursematerialviewnr(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Authenticateldap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticateldap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticateldap</em>' attribute.
	 * @see #setAuthenticateldap(BigInteger)
	 * @see lobj.LobjPackage#getUser_Authenticateldap()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	BigInteger getAuthenticateldap();

	/**
	 * Sets the value of the '{@link lobj.User#getAuthenticateldap <em>Authenticateldap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticateldap</em>' attribute.
	 * @see #getAuthenticateldap()
	 * @generated
	 */
	void setAuthenticateldap(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Photochanged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photochanged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photochanged</em>' attribute.
	 * @see #setPhotochanged(BigInteger)
	 * @see lobj.LobjPackage#getUser_Photochanged()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	BigInteger getPhotochanged();

	/**
	 * Sets the value of the '{@link lobj.User#getPhotochanged <em>Photochanged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photochanged</em>' attribute.
	 * @see #getPhotochanged()
	 * @generated
	 */
	void setPhotochanged(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Authorizations</b></em>' reference list.
	 * The list contents are of type {@link lobj.AuthorizationTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorizations</em>' reference list.
	 * @see lobj.LobjPackage#getUser_Authorizations()
	 * @model type="lobj.AuthorizationTypes"
	 *        extendedMetaData="kind='element' namespace='##targetNamespace'"
	 *        annotation="http://annotation.elver.org/Indexed value='false'"
	 * @generated
	 */
	EList getAuthorizations();

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
	 * @see lobj.LobjPackage#getUser_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lobj.User#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // User

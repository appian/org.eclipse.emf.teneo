/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;

import lobj.AuthorizationTypes;
import lobj.LobjPackage;
import lobj.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.UserImpl#getLoginname <em>Loginname</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getMatriculationnr <em>Matriculationnr</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getScn <em>Scn</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getIcqnumber <em>Icqnumber</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getIcqpassword <em>Icqpassword</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getEntryasxml <em>Entryasxml</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getLanguagenr <em>Languagenr</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getNotificationprofileasxml <em>Notificationprofileasxml</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getDossierasxml <em>Dossierasxml</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getOnlinestatus <em>Onlinestatus</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getOnlinedate <em>Onlinedate</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getDatafilter <em>Datafilter</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getInchatsince <em>Inchatsince</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getContchatdate <em>Contchatdate</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getChatroomnr <em>Chatroomnr</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getFromext <em>Fromext</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getLastlogindate <em>Lastlogindate</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getCurrlogindate <em>Currlogindate</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getLastcoursematerialnr <em>Lastcoursematerialnr</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getLastcoursematerialviewnr <em>Lastcoursematerialviewnr</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getAuthenticateldap <em>Authenticateldap</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getPhotochanged <em>Photochanged</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getAuthorizations <em>Authorizations</em>}</li>
 *   <li>{@link lobj.impl.UserImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends EObjectImpl implements User {
	/**
	 * The default value of the '{@link #getLoginname() <em>Loginname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginname()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGINNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoginname() <em>Loginname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginname()
	 * @generated
	 * @ordered
	 */
	protected String loginname = LOGINNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatriculationnr() <em>Matriculationnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculationnr()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRICULATIONNR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatriculationnr() <em>Matriculationnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculationnr()
	 * @generated
	 * @ordered
	 */
	protected String matriculationnr = MATRICULATIONNR_EDEFAULT;

	/**
	 * The default value of the '{@link #getScn() <em>Scn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScn()
	 * @generated
	 * @ordered
	 */
	protected static final String SCN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScn() <em>Scn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScn()
	 * @generated
	 * @ordered
	 */
	protected String scn = SCN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcqnumber() <em>Icqnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcqnumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ICQNUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcqnumber() <em>Icqnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcqnumber()
	 * @generated
	 * @ordered
	 */
	protected String icqnumber = ICQNUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcqpassword() <em>Icqpassword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcqpassword()
	 * @generated
	 * @ordered
	 */
	protected static final String ICQPASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcqpassword() <em>Icqpassword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcqpassword()
	 * @generated
	 * @ordered
	 */
	protected String icqpassword = ICQPASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryasxml() <em>Entryasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryasxml()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRYASXML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryasxml() <em>Entryasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryasxml()
	 * @generated
	 * @ordered
	 */
	protected String entryasxml = ENTRYASXML_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguagenr() <em>Languagenr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguagenr()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGENR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguagenr() <em>Languagenr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguagenr()
	 * @generated
	 * @ordered
	 */
	protected String languagenr = LANGUAGENR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationprofileasxml() <em>Notificationprofileasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationprofileasxml()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATIONPROFILEASXML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotificationprofileasxml() <em>Notificationprofileasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationprofileasxml()
	 * @generated
	 * @ordered
	 */
	protected String notificationprofileasxml = NOTIFICATIONPROFILEASXML_EDEFAULT;

	/**
	 * The default value of the '{@link #getDossierasxml() <em>Dossierasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDossierasxml()
	 * @generated
	 * @ordered
	 */
	protected static final String DOSSIERASXML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDossierasxml() <em>Dossierasxml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDossierasxml()
	 * @generated
	 * @ordered
	 */
	protected String dossierasxml = DOSSIERASXML_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoto() <em>Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PHOTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected byte[] photo = PHOTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnlinestatus() <em>Onlinestatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlinestatus()
	 * @generated
	 * @ordered
	 */
	protected static final String ONLINESTATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnlinestatus() <em>Onlinestatus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlinestatus()
	 * @generated
	 * @ordered
	 */
	protected String onlinestatus = ONLINESTATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnlinedate() <em>Onlinedate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlinedate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ONLINEDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnlinedate() <em>Onlinedate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlinedate()
	 * @generated
	 * @ordered
	 */
	protected Date onlinedate = ONLINEDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatafilter() <em>Datafilter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatafilter()
	 * @generated
	 * @ordered
	 */
	protected static final String DATAFILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatafilter() <em>Datafilter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatafilter()
	 * @generated
	 * @ordered
	 */
	protected String datafilter = DATAFILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInchatsince() <em>Inchatsince</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInchatsince()
	 * @generated
	 * @ordered
	 */
	protected static final Date INCHATSINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInchatsince() <em>Inchatsince</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInchatsince()
	 * @generated
	 * @ordered
	 */
	protected Date inchatsince = INCHATSINCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContchatdate() <em>Contchatdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContchatdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CONTCHATDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContchatdate() <em>Contchatdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContchatdate()
	 * @generated
	 * @ordered
	 */
	protected Date contchatdate = CONTCHATDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChatroomnr() <em>Chatroomnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChatroomnr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CHATROOMNR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChatroomnr() <em>Chatroomnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChatroomnr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger chatroomnr = CHATROOMNR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromext() <em>Fromext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromext()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FROMEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromext() <em>Fromext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromext()
	 * @generated
	 * @ordered
	 */
	protected BigInteger fromext = FROMEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastlogindate() <em>Lastlogindate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastlogindate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LASTLOGINDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastlogindate() <em>Lastlogindate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastlogindate()
	 * @generated
	 * @ordered
	 */
	protected Date lastlogindate = LASTLOGINDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrlogindate() <em>Currlogindate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrlogindate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CURRLOGINDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrlogindate() <em>Currlogindate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrlogindate()
	 * @generated
	 * @ordered
	 */
	protected Date currlogindate = CURRLOGINDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastcoursematerialnr() <em>Lastcoursematerialnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastcoursematerialnr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LASTCOURSEMATERIALNR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastcoursematerialnr() <em>Lastcoursematerialnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastcoursematerialnr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lastcoursematerialnr = LASTCOURSEMATERIALNR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastcoursematerialviewnr() <em>Lastcoursematerialviewnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastcoursematerialviewnr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LASTCOURSEMATERIALVIEWNR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastcoursematerialviewnr() <em>Lastcoursematerialviewnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastcoursematerialviewnr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger lastcoursematerialviewnr = LASTCOURSEMATERIALVIEWNR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticateldap() <em>Authenticateldap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticateldap()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger AUTHENTICATELDAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticateldap() <em>Authenticateldap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticateldap()
	 * @generated
	 * @ordered
	 */
	protected BigInteger authenticateldap = AUTHENTICATELDAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhotochanged() <em>Photochanged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotochanged()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PHOTOCHANGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhotochanged() <em>Photochanged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotochanged()
	 * @generated
	 * @ordered
	 */
	protected BigInteger photochanged = PHOTOCHANGED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthorizations() <em>Authorizations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizations()
	 * @generated
	 * @ordered
	 */
	protected EList authorizations;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoginname() {
		return loginname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginname(String newLoginname) {
		String oldLoginname = loginname;
		loginname = newLoginname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__LOGINNAME, oldLoginname, loginname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__LASTNAME, oldLastname, lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatriculationnr() {
		return matriculationnr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatriculationnr(String newMatriculationnr) {
		String oldMatriculationnr = matriculationnr;
		matriculationnr = newMatriculationnr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__MATRICULATIONNR, oldMatriculationnr, matriculationnr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScn() {
		return scn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScn(String newScn) {
		String oldScn = scn;
		scn = newScn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__SCN, oldScn, scn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcqnumber() {
		return icqnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcqnumber(String newIcqnumber) {
		String oldIcqnumber = icqnumber;
		icqnumber = newIcqnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__ICQNUMBER, oldIcqnumber, icqnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcqpassword() {
		return icqpassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcqpassword(String newIcqpassword) {
		String oldIcqpassword = icqpassword;
		icqpassword = newIcqpassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__ICQPASSWORD, oldIcqpassword, icqpassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryasxml() {
		return entryasxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryasxml(String newEntryasxml) {
		String oldEntryasxml = entryasxml;
		entryasxml = newEntryasxml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__ENTRYASXML, oldEntryasxml, entryasxml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguagenr() {
		return languagenr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguagenr(String newLanguagenr) {
		String oldLanguagenr = languagenr;
		languagenr = newLanguagenr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__LANGUAGENR, oldLanguagenr, languagenr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotificationprofileasxml() {
		return notificationprofileasxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationprofileasxml(String newNotificationprofileasxml) {
		String oldNotificationprofileasxml = notificationprofileasxml;
		notificationprofileasxml = newNotificationprofileasxml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__NOTIFICATIONPROFILEASXML, oldNotificationprofileasxml, notificationprofileasxml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDossierasxml() {
		return dossierasxml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDossierasxml(String newDossierasxml) {
		String oldDossierasxml = dossierasxml;
		dossierasxml = newDossierasxml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__DOSSIERASXML, oldDossierasxml, dossierasxml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoto(byte[] newPhoto) {
		byte[] oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__PHOTO, oldPhoto, photo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnlinestatus() {
		return onlinestatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlinestatus(String newOnlinestatus) {
		String oldOnlinestatus = onlinestatus;
		onlinestatus = newOnlinestatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__ONLINESTATUS, oldOnlinestatus, onlinestatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOnlinedate() {
		return onlinedate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlinedate(Date newOnlinedate) {
		Date oldOnlinedate = onlinedate;
		onlinedate = newOnlinedate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__ONLINEDATE, oldOnlinedate, onlinedate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatafilter() {
		return datafilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatafilter(String newDatafilter) {
		String oldDatafilter = datafilter;
		datafilter = newDatafilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__DATAFILTER, oldDatafilter, datafilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getInchatsince() {
		return inchatsince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInchatsince(Date newInchatsince) {
		Date oldInchatsince = inchatsince;
		inchatsince = newInchatsince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__INCHATSINCE, oldInchatsince, inchatsince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getContchatdate() {
		return contchatdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContchatdate(Date newContchatdate) {
		Date oldContchatdate = contchatdate;
		contchatdate = newContchatdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__CONTCHATDATE, oldContchatdate, contchatdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getChatroomnr() {
		return chatroomnr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChatroomnr(BigInteger newChatroomnr) {
		BigInteger oldChatroomnr = chatroomnr;
		chatroomnr = newChatroomnr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__CHATROOMNR, oldChatroomnr, chatroomnr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFromext() {
		return fromext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromext(BigInteger newFromext) {
		BigInteger oldFromext = fromext;
		fromext = newFromext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__FROMEXT, oldFromext, fromext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastlogindate() {
		return lastlogindate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastlogindate(Date newLastlogindate) {
		Date oldLastlogindate = lastlogindate;
		lastlogindate = newLastlogindate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__LASTLOGINDATE, oldLastlogindate, lastlogindate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCurrlogindate() {
		return currlogindate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrlogindate(Date newCurrlogindate) {
		Date oldCurrlogindate = currlogindate;
		currlogindate = newCurrlogindate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__CURRLOGINDATE, oldCurrlogindate, currlogindate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLastcoursematerialnr() {
		return lastcoursematerialnr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastcoursematerialnr(BigInteger newLastcoursematerialnr) {
		BigInteger oldLastcoursematerialnr = lastcoursematerialnr;
		lastcoursematerialnr = newLastcoursematerialnr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__LASTCOURSEMATERIALNR, oldLastcoursematerialnr, lastcoursematerialnr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLastcoursematerialviewnr() {
		return lastcoursematerialviewnr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastcoursematerialviewnr(BigInteger newLastcoursematerialviewnr) {
		BigInteger oldLastcoursematerialviewnr = lastcoursematerialviewnr;
		lastcoursematerialviewnr = newLastcoursematerialviewnr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__LASTCOURSEMATERIALVIEWNR, oldLastcoursematerialviewnr, lastcoursematerialviewnr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAuthenticateldap() {
		return authenticateldap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticateldap(BigInteger newAuthenticateldap) {
		BigInteger oldAuthenticateldap = authenticateldap;
		authenticateldap = newAuthenticateldap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__AUTHENTICATELDAP, oldAuthenticateldap, authenticateldap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPhotochanged() {
		return photochanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhotochanged(BigInteger newPhotochanged) {
		BigInteger oldPhotochanged = photochanged;
		photochanged = newPhotochanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__PHOTOCHANGED, oldPhotochanged, photochanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAuthorizations() {
		if (authorizations == null) {
			authorizations = new EObjectResolvingEList(AuthorizationTypes.class, this, LobjPackage.USER__AUTHORIZATIONS);
		}
		return authorizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.USER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.USER__LOGINNAME:
				return getLoginname();
			case LobjPackage.USER__PASSWORD:
				return getPassword();
			case LobjPackage.USER__FIRSTNAME:
				return getFirstname();
			case LobjPackage.USER__LASTNAME:
				return getLastname();
			case LobjPackage.USER__MATRICULATIONNR:
				return getMatriculationnr();
			case LobjPackage.USER__SCN:
				return getScn();
			case LobjPackage.USER__ICQNUMBER:
				return getIcqnumber();
			case LobjPackage.USER__ICQPASSWORD:
				return getIcqpassword();
			case LobjPackage.USER__ENTRYASXML:
				return getEntryasxml();
			case LobjPackage.USER__LANGUAGENR:
				return getLanguagenr();
			case LobjPackage.USER__NOTIFICATIONPROFILEASXML:
				return getNotificationprofileasxml();
			case LobjPackage.USER__DOSSIERASXML:
				return getDossierasxml();
			case LobjPackage.USER__PHOTO:
				return getPhoto();
			case LobjPackage.USER__ONLINESTATUS:
				return getOnlinestatus();
			case LobjPackage.USER__ONLINEDATE:
				return getOnlinedate();
			case LobjPackage.USER__DATAFILTER:
				return getDatafilter();
			case LobjPackage.USER__INCHATSINCE:
				return getInchatsince();
			case LobjPackage.USER__CONTCHATDATE:
				return getContchatdate();
			case LobjPackage.USER__CHATROOMNR:
				return getChatroomnr();
			case LobjPackage.USER__FROMEXT:
				return getFromext();
			case LobjPackage.USER__LASTLOGINDATE:
				return getLastlogindate();
			case LobjPackage.USER__CURRLOGINDATE:
				return getCurrlogindate();
			case LobjPackage.USER__LASTCOURSEMATERIALNR:
				return getLastcoursematerialnr();
			case LobjPackage.USER__LASTCOURSEMATERIALVIEWNR:
				return getLastcoursematerialviewnr();
			case LobjPackage.USER__AUTHENTICATELDAP:
				return getAuthenticateldap();
			case LobjPackage.USER__PHOTOCHANGED:
				return getPhotochanged();
			case LobjPackage.USER__AUTHORIZATIONS:
				return getAuthorizations();
			case LobjPackage.USER__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LobjPackage.USER__LOGINNAME:
				setLoginname((String)newValue);
				return;
			case LobjPackage.USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case LobjPackage.USER__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case LobjPackage.USER__LASTNAME:
				setLastname((String)newValue);
				return;
			case LobjPackage.USER__MATRICULATIONNR:
				setMatriculationnr((String)newValue);
				return;
			case LobjPackage.USER__SCN:
				setScn((String)newValue);
				return;
			case LobjPackage.USER__ICQNUMBER:
				setIcqnumber((String)newValue);
				return;
			case LobjPackage.USER__ICQPASSWORD:
				setIcqpassword((String)newValue);
				return;
			case LobjPackage.USER__ENTRYASXML:
				setEntryasxml((String)newValue);
				return;
			case LobjPackage.USER__LANGUAGENR:
				setLanguagenr((String)newValue);
				return;
			case LobjPackage.USER__NOTIFICATIONPROFILEASXML:
				setNotificationprofileasxml((String)newValue);
				return;
			case LobjPackage.USER__DOSSIERASXML:
				setDossierasxml((String)newValue);
				return;
			case LobjPackage.USER__PHOTO:
				setPhoto((byte[])newValue);
				return;
			case LobjPackage.USER__ONLINESTATUS:
				setOnlinestatus((String)newValue);
				return;
			case LobjPackage.USER__ONLINEDATE:
				setOnlinedate((Date)newValue);
				return;
			case LobjPackage.USER__DATAFILTER:
				setDatafilter((String)newValue);
				return;
			case LobjPackage.USER__INCHATSINCE:
				setInchatsince((Date)newValue);
				return;
			case LobjPackage.USER__CONTCHATDATE:
				setContchatdate((Date)newValue);
				return;
			case LobjPackage.USER__CHATROOMNR:
				setChatroomnr((BigInteger)newValue);
				return;
			case LobjPackage.USER__FROMEXT:
				setFromext((BigInteger)newValue);
				return;
			case LobjPackage.USER__LASTLOGINDATE:
				setLastlogindate((Date)newValue);
				return;
			case LobjPackage.USER__CURRLOGINDATE:
				setCurrlogindate((Date)newValue);
				return;
			case LobjPackage.USER__LASTCOURSEMATERIALNR:
				setLastcoursematerialnr((BigInteger)newValue);
				return;
			case LobjPackage.USER__LASTCOURSEMATERIALVIEWNR:
				setLastcoursematerialviewnr((BigInteger)newValue);
				return;
			case LobjPackage.USER__AUTHENTICATELDAP:
				setAuthenticateldap((BigInteger)newValue);
				return;
			case LobjPackage.USER__PHOTOCHANGED:
				setPhotochanged((BigInteger)newValue);
				return;
			case LobjPackage.USER__AUTHORIZATIONS:
				getAuthorizations().clear();
				getAuthorizations().addAll((Collection)newValue);
				return;
			case LobjPackage.USER__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case LobjPackage.USER__LOGINNAME:
				setLoginname(LOGINNAME_EDEFAULT);
				return;
			case LobjPackage.USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case LobjPackage.USER__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case LobjPackage.USER__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
				return;
			case LobjPackage.USER__MATRICULATIONNR:
				setMatriculationnr(MATRICULATIONNR_EDEFAULT);
				return;
			case LobjPackage.USER__SCN:
				setScn(SCN_EDEFAULT);
				return;
			case LobjPackage.USER__ICQNUMBER:
				setIcqnumber(ICQNUMBER_EDEFAULT);
				return;
			case LobjPackage.USER__ICQPASSWORD:
				setIcqpassword(ICQPASSWORD_EDEFAULT);
				return;
			case LobjPackage.USER__ENTRYASXML:
				setEntryasxml(ENTRYASXML_EDEFAULT);
				return;
			case LobjPackage.USER__LANGUAGENR:
				setLanguagenr(LANGUAGENR_EDEFAULT);
				return;
			case LobjPackage.USER__NOTIFICATIONPROFILEASXML:
				setNotificationprofileasxml(NOTIFICATIONPROFILEASXML_EDEFAULT);
				return;
			case LobjPackage.USER__DOSSIERASXML:
				setDossierasxml(DOSSIERASXML_EDEFAULT);
				return;
			case LobjPackage.USER__PHOTO:
				setPhoto(PHOTO_EDEFAULT);
				return;
			case LobjPackage.USER__ONLINESTATUS:
				setOnlinestatus(ONLINESTATUS_EDEFAULT);
				return;
			case LobjPackage.USER__ONLINEDATE:
				setOnlinedate(ONLINEDATE_EDEFAULT);
				return;
			case LobjPackage.USER__DATAFILTER:
				setDatafilter(DATAFILTER_EDEFAULT);
				return;
			case LobjPackage.USER__INCHATSINCE:
				setInchatsince(INCHATSINCE_EDEFAULT);
				return;
			case LobjPackage.USER__CONTCHATDATE:
				setContchatdate(CONTCHATDATE_EDEFAULT);
				return;
			case LobjPackage.USER__CHATROOMNR:
				setChatroomnr(CHATROOMNR_EDEFAULT);
				return;
			case LobjPackage.USER__FROMEXT:
				setFromext(FROMEXT_EDEFAULT);
				return;
			case LobjPackage.USER__LASTLOGINDATE:
				setLastlogindate(LASTLOGINDATE_EDEFAULT);
				return;
			case LobjPackage.USER__CURRLOGINDATE:
				setCurrlogindate(CURRLOGINDATE_EDEFAULT);
				return;
			case LobjPackage.USER__LASTCOURSEMATERIALNR:
				setLastcoursematerialnr(LASTCOURSEMATERIALNR_EDEFAULT);
				return;
			case LobjPackage.USER__LASTCOURSEMATERIALVIEWNR:
				setLastcoursematerialviewnr(LASTCOURSEMATERIALVIEWNR_EDEFAULT);
				return;
			case LobjPackage.USER__AUTHENTICATELDAP:
				setAuthenticateldap(AUTHENTICATELDAP_EDEFAULT);
				return;
			case LobjPackage.USER__PHOTOCHANGED:
				setPhotochanged(PHOTOCHANGED_EDEFAULT);
				return;
			case LobjPackage.USER__AUTHORIZATIONS:
				getAuthorizations().clear();
				return;
			case LobjPackage.USER__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LobjPackage.USER__LOGINNAME:
				return LOGINNAME_EDEFAULT == null ? loginname != null : !LOGINNAME_EDEFAULT.equals(loginname);
			case LobjPackage.USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case LobjPackage.USER__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case LobjPackage.USER__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
			case LobjPackage.USER__MATRICULATIONNR:
				return MATRICULATIONNR_EDEFAULT == null ? matriculationnr != null : !MATRICULATIONNR_EDEFAULT.equals(matriculationnr);
			case LobjPackage.USER__SCN:
				return SCN_EDEFAULT == null ? scn != null : !SCN_EDEFAULT.equals(scn);
			case LobjPackage.USER__ICQNUMBER:
				return ICQNUMBER_EDEFAULT == null ? icqnumber != null : !ICQNUMBER_EDEFAULT.equals(icqnumber);
			case LobjPackage.USER__ICQPASSWORD:
				return ICQPASSWORD_EDEFAULT == null ? icqpassword != null : !ICQPASSWORD_EDEFAULT.equals(icqpassword);
			case LobjPackage.USER__ENTRYASXML:
				return ENTRYASXML_EDEFAULT == null ? entryasxml != null : !ENTRYASXML_EDEFAULT.equals(entryasxml);
			case LobjPackage.USER__LANGUAGENR:
				return LANGUAGENR_EDEFAULT == null ? languagenr != null : !LANGUAGENR_EDEFAULT.equals(languagenr);
			case LobjPackage.USER__NOTIFICATIONPROFILEASXML:
				return NOTIFICATIONPROFILEASXML_EDEFAULT == null ? notificationprofileasxml != null : !NOTIFICATIONPROFILEASXML_EDEFAULT.equals(notificationprofileasxml);
			case LobjPackage.USER__DOSSIERASXML:
				return DOSSIERASXML_EDEFAULT == null ? dossierasxml != null : !DOSSIERASXML_EDEFAULT.equals(dossierasxml);
			case LobjPackage.USER__PHOTO:
				return PHOTO_EDEFAULT == null ? photo != null : !PHOTO_EDEFAULT.equals(photo);
			case LobjPackage.USER__ONLINESTATUS:
				return ONLINESTATUS_EDEFAULT == null ? onlinestatus != null : !ONLINESTATUS_EDEFAULT.equals(onlinestatus);
			case LobjPackage.USER__ONLINEDATE:
				return ONLINEDATE_EDEFAULT == null ? onlinedate != null : !ONLINEDATE_EDEFAULT.equals(onlinedate);
			case LobjPackage.USER__DATAFILTER:
				return DATAFILTER_EDEFAULT == null ? datafilter != null : !DATAFILTER_EDEFAULT.equals(datafilter);
			case LobjPackage.USER__INCHATSINCE:
				return INCHATSINCE_EDEFAULT == null ? inchatsince != null : !INCHATSINCE_EDEFAULT.equals(inchatsince);
			case LobjPackage.USER__CONTCHATDATE:
				return CONTCHATDATE_EDEFAULT == null ? contchatdate != null : !CONTCHATDATE_EDEFAULT.equals(contchatdate);
			case LobjPackage.USER__CHATROOMNR:
				return CHATROOMNR_EDEFAULT == null ? chatroomnr != null : !CHATROOMNR_EDEFAULT.equals(chatroomnr);
			case LobjPackage.USER__FROMEXT:
				return FROMEXT_EDEFAULT == null ? fromext != null : !FROMEXT_EDEFAULT.equals(fromext);
			case LobjPackage.USER__LASTLOGINDATE:
				return LASTLOGINDATE_EDEFAULT == null ? lastlogindate != null : !LASTLOGINDATE_EDEFAULT.equals(lastlogindate);
			case LobjPackage.USER__CURRLOGINDATE:
				return CURRLOGINDATE_EDEFAULT == null ? currlogindate != null : !CURRLOGINDATE_EDEFAULT.equals(currlogindate);
			case LobjPackage.USER__LASTCOURSEMATERIALNR:
				return LASTCOURSEMATERIALNR_EDEFAULT == null ? lastcoursematerialnr != null : !LASTCOURSEMATERIALNR_EDEFAULT.equals(lastcoursematerialnr);
			case LobjPackage.USER__LASTCOURSEMATERIALVIEWNR:
				return LASTCOURSEMATERIALVIEWNR_EDEFAULT == null ? lastcoursematerialviewnr != null : !LASTCOURSEMATERIALVIEWNR_EDEFAULT.equals(lastcoursematerialviewnr);
			case LobjPackage.USER__AUTHENTICATELDAP:
				return AUTHENTICATELDAP_EDEFAULT == null ? authenticateldap != null : !AUTHENTICATELDAP_EDEFAULT.equals(authenticateldap);
			case LobjPackage.USER__PHOTOCHANGED:
				return PHOTOCHANGED_EDEFAULT == null ? photochanged != null : !PHOTOCHANGED_EDEFAULT.equals(photochanged);
			case LobjPackage.USER__AUTHORIZATIONS:
				return authorizations != null && !authorizations.isEmpty();
			case LobjPackage.USER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (loginname: ");
		result.append(loginname);
		result.append(", password: ");
		result.append(password);
		result.append(", firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", matriculationnr: ");
		result.append(matriculationnr);
		result.append(", scn: ");
		result.append(scn);
		result.append(", icqnumber: ");
		result.append(icqnumber);
		result.append(", icqpassword: ");
		result.append(icqpassword);
		result.append(", entryasxml: ");
		result.append(entryasxml);
		result.append(", languagenr: ");
		result.append(languagenr);
		result.append(", notificationprofileasxml: ");
		result.append(notificationprofileasxml);
		result.append(", dossierasxml: ");
		result.append(dossierasxml);
		result.append(", photo: ");
		result.append(photo);
		result.append(", onlinestatus: ");
		result.append(onlinestatus);
		result.append(", onlinedate: ");
		result.append(onlinedate);
		result.append(", datafilter: ");
		result.append(datafilter);
		result.append(", inchatsince: ");
		result.append(inchatsince);
		result.append(", contchatdate: ");
		result.append(contchatdate);
		result.append(", chatroomnr: ");
		result.append(chatroomnr);
		result.append(", fromext: ");
		result.append(fromext);
		result.append(", lastlogindate: ");
		result.append(lastlogindate);
		result.append(", currlogindate: ");
		result.append(currlogindate);
		result.append(", lastcoursematerialnr: ");
		result.append(lastcoursematerialnr);
		result.append(", lastcoursematerialviewnr: ");
		result.append(lastcoursematerialviewnr);
		result.append(", authenticateldap: ");
		result.append(authenticateldap);
		result.append(", photochanged: ");
		result.append(photochanged);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //UserImpl

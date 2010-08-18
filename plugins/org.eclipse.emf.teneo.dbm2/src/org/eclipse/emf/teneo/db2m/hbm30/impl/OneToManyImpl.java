/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToManyImpl.java,v 1.1 2010/08/18 09:21:39 cbouhier Exp $
 */
package org.eclipse.emf.teneo.db2m.hbm30.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.db2m.hbm30.Hbm30Package;
import org.eclipse.emf.teneo.db2m.hbm30.Notfound;
import org.eclipse.emf.teneo.db2m.hbm30.OneToMany;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One To Many</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToManyImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToManyImpl#isEmbedXml <em>Embed Xml</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToManyImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToManyImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.db2m.hbm30.impl.OneToManyImpl#getNotFound <em>Not Found</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneToManyImpl extends EObjectImpl implements OneToMany {
	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmbedXml() <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedXml()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBED_XML_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEmbedXml() <em>Embed Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedXml()
	 * @generated
	 * @ordered
	 */
	protected boolean embedXml = EMBED_XML_EDEFAULT;

	/**
	 * This is true if the Embed Xml attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean embedXmlESet;

	/**
	 * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityName()
	 * @generated
	 * @ordered
	 */
	protected String entityName = ENTITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected String node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotFound() <em>Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotFound()
	 * @generated
	 * @ordered
	 */
	protected static final Notfound NOT_FOUND_EDEFAULT = Notfound.EXCEPTION;

	/**
	 * The cached value of the '{@link #getNotFound() <em>Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotFound()
	 * @generated
	 * @ordered
	 */
	protected Notfound notFound = NOT_FOUND_EDEFAULT;

	/**
	 * This is true if the Not Found attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notFoundESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneToManyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hbm30Package.eINSTANCE.getOneToMany();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_MANY__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbedXml() {
		return embedXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedXml(boolean newEmbedXml) {
		boolean oldEmbedXml = embedXml;
		embedXml = newEmbedXml;
		boolean oldEmbedXmlESet = embedXmlESet;
		embedXmlESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_MANY__EMBED_XML, oldEmbedXml, embedXml, !oldEmbedXmlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEmbedXml() {
		boolean oldEmbedXml = embedXml;
		boolean oldEmbedXmlESet = embedXmlESet;
		embedXml = EMBED_XML_EDEFAULT;
		embedXmlESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.ONE_TO_MANY__EMBED_XML, oldEmbedXml, EMBED_XML_EDEFAULT, oldEmbedXmlESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEmbedXml() {
		return embedXmlESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityName() {
		return entityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityName(String newEntityName) {
		String oldEntityName = entityName;
		entityName = newEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_MANY__ENTITY_NAME, oldEntityName, entityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		String oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_MANY__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notfound getNotFound() {
		return notFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotFound(Notfound newNotFound) {
		Notfound oldNotFound = notFound;
		notFound = newNotFound == null ? NOT_FOUND_EDEFAULT : newNotFound;
		boolean oldNotFoundESet = notFoundESet;
		notFoundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hbm30Package.ONE_TO_MANY__NOT_FOUND, oldNotFound, notFound, !oldNotFoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotFound() {
		Notfound oldNotFound = notFound;
		boolean oldNotFoundESet = notFoundESet;
		notFound = NOT_FOUND_EDEFAULT;
		notFoundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Hbm30Package.ONE_TO_MANY__NOT_FOUND, oldNotFound, NOT_FOUND_EDEFAULT, oldNotFoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotFound() {
		return notFoundESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hbm30Package.ONE_TO_MANY__CLASS:
				return getClass_();
			case Hbm30Package.ONE_TO_MANY__EMBED_XML:
				return isEmbedXml();
			case Hbm30Package.ONE_TO_MANY__ENTITY_NAME:
				return getEntityName();
			case Hbm30Package.ONE_TO_MANY__NODE:
				return getNode();
			case Hbm30Package.ONE_TO_MANY__NOT_FOUND:
				return getNotFound();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Hbm30Package.ONE_TO_MANY__CLASS:
				setClass((String)newValue);
				return;
			case Hbm30Package.ONE_TO_MANY__EMBED_XML:
				setEmbedXml((Boolean)newValue);
				return;
			case Hbm30Package.ONE_TO_MANY__ENTITY_NAME:
				setEntityName((String)newValue);
				return;
			case Hbm30Package.ONE_TO_MANY__NODE:
				setNode((String)newValue);
				return;
			case Hbm30Package.ONE_TO_MANY__NOT_FOUND:
				setNotFound((Notfound)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Hbm30Package.ONE_TO_MANY__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_MANY__EMBED_XML:
				unsetEmbedXml();
				return;
			case Hbm30Package.ONE_TO_MANY__ENTITY_NAME:
				setEntityName(ENTITY_NAME_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_MANY__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case Hbm30Package.ONE_TO_MANY__NOT_FOUND:
				unsetNotFound();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Hbm30Package.ONE_TO_MANY__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Hbm30Package.ONE_TO_MANY__EMBED_XML:
				return isSetEmbedXml();
			case Hbm30Package.ONE_TO_MANY__ENTITY_NAME:
				return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
			case Hbm30Package.ONE_TO_MANY__NODE:
				return NODE_EDEFAULT == null ? node != null : !NODE_EDEFAULT.equals(node);
			case Hbm30Package.ONE_TO_MANY__NOT_FOUND:
				return isSetNotFound();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (class: ");
		result.append(class_);
		result.append(", embedXml: ");
		if (embedXmlESet) result.append(embedXml); else result.append("<unset>");
		result.append(", entityName: ");
		result.append(entityName);
		result.append(", node: ");
		result.append(node);
		result.append(", notFound: ");
		if (notFoundESet) result.append(notFound); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OneToManyImpl

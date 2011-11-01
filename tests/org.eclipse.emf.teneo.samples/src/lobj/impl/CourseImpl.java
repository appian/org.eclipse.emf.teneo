/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import java.util.Collection;

import lobj.Course;
import lobj.CourseMeta;
import lobj.Coursetype;
import lobj.ExternalMetadata;
import lobj.LobjPackage;
import lobj.Module;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.CourseImpl#getCourseMeta <em>Course Meta</em>}</li>
 *   <li>{@link lobj.impl.CourseImpl#getExternalMetadata <em>External Metadata</em>}</li>
 *   <li>{@link lobj.impl.CourseImpl#getCoursetype <em>Coursetype</em>}</li>
 *   <li>{@link lobj.impl.CourseImpl#getOutlineAsXml <em>Outline As Xml</em>}</li>
 *   <li>{@link lobj.impl.CourseImpl#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CourseImpl extends LearningObjectImpl implements Course {
	/**
	 * The cached value of the '{@link #getCourseMeta() <em>Course Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseMeta()
	 * @generated
	 * @ordered
	 */
	protected CourseMeta courseMeta;

	/**
	 * The cached value of the '{@link #getExternalMetadata() <em>External Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList externalMetadata;

	/**
	 * The cached value of the '{@link #getCoursetype() <em>Coursetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoursetype()
	 * @generated
	 * @ordered
	 */
	protected Coursetype coursetype;

	/**
	 * The default value of the '{@link #getOutlineAsXml() <em>Outline As Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineAsXml()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTLINE_AS_XML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutlineAsXml() <em>Outline As Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineAsXml()
	 * @generated
	 * @ordered
	 */
	protected String outlineAsXml = OUTLINE_AS_XML_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected EList module;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseMeta getCourseMeta() {
		return courseMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseMeta(CourseMeta newCourseMeta, NotificationChain msgs) {
		CourseMeta oldCourseMeta = courseMeta;
		courseMeta = newCourseMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE__COURSE_META, oldCourseMeta, newCourseMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseMeta(CourseMeta newCourseMeta) {
		if (newCourseMeta != courseMeta) {
			NotificationChain msgs = null;
			if (courseMeta != null)
				msgs = ((InternalEObject)courseMeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.COURSE__COURSE_META, null, msgs);
			if (newCourseMeta != null)
				msgs = ((InternalEObject)newCourseMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.COURSE__COURSE_META, null, msgs);
			msgs = basicSetCourseMeta(newCourseMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE__COURSE_META, newCourseMeta, newCourseMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExternalMetadata() {
		if (externalMetadata == null) {
			externalMetadata = new EObjectContainmentEList(ExternalMetadata.class, this, LobjPackage.COURSE__EXTERNAL_METADATA);
		}
		return externalMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coursetype getCoursetype() {
		if (coursetype != null && coursetype.eIsProxy()) {
			InternalEObject oldCoursetype = (InternalEObject)coursetype;
			coursetype = (Coursetype)eResolveProxy(oldCoursetype);
			if (coursetype != oldCoursetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LobjPackage.COURSE__COURSETYPE, oldCoursetype, coursetype));
			}
		}
		return coursetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coursetype basicGetCoursetype() {
		return coursetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoursetype(Coursetype newCoursetype) {
		Coursetype oldCoursetype = coursetype;
		coursetype = newCoursetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE__COURSETYPE, oldCoursetype, coursetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutlineAsXml() {
		return outlineAsXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutlineAsXml(String newOutlineAsXml) {
		String oldOutlineAsXml = outlineAsXml;
		outlineAsXml = newOutlineAsXml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.COURSE__OUTLINE_AS_XML, oldOutlineAsXml, outlineAsXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getModule() {
		if (module == null) {
			module = new EObjectResolvingEList(Module.class, this, LobjPackage.COURSE__MODULE);
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.COURSE__COURSE_META:
				return basicSetCourseMeta(null, msgs);
			case LobjPackage.COURSE__EXTERNAL_METADATA:
				return ((InternalEList)getExternalMetadata()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LobjPackage.COURSE__COURSE_META:
				return getCourseMeta();
			case LobjPackage.COURSE__EXTERNAL_METADATA:
				return getExternalMetadata();
			case LobjPackage.COURSE__COURSETYPE:
				if (resolve) return getCoursetype();
				return basicGetCoursetype();
			case LobjPackage.COURSE__OUTLINE_AS_XML:
				return getOutlineAsXml();
			case LobjPackage.COURSE__MODULE:
				return getModule();
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
			case LobjPackage.COURSE__COURSE_META:
				setCourseMeta((CourseMeta)newValue);
				return;
			case LobjPackage.COURSE__EXTERNAL_METADATA:
				getExternalMetadata().clear();
				getExternalMetadata().addAll((Collection)newValue);
				return;
			case LobjPackage.COURSE__COURSETYPE:
				setCoursetype((Coursetype)newValue);
				return;
			case LobjPackage.COURSE__OUTLINE_AS_XML:
				setOutlineAsXml((String)newValue);
				return;
			case LobjPackage.COURSE__MODULE:
				getModule().clear();
				getModule().addAll((Collection)newValue);
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
			case LobjPackage.COURSE__COURSE_META:
				setCourseMeta((CourseMeta)null);
				return;
			case LobjPackage.COURSE__EXTERNAL_METADATA:
				getExternalMetadata().clear();
				return;
			case LobjPackage.COURSE__COURSETYPE:
				setCoursetype((Coursetype)null);
				return;
			case LobjPackage.COURSE__OUTLINE_AS_XML:
				setOutlineAsXml(OUTLINE_AS_XML_EDEFAULT);
				return;
			case LobjPackage.COURSE__MODULE:
				getModule().clear();
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
			case LobjPackage.COURSE__COURSE_META:
				return courseMeta != null;
			case LobjPackage.COURSE__EXTERNAL_METADATA:
				return externalMetadata != null && !externalMetadata.isEmpty();
			case LobjPackage.COURSE__COURSETYPE:
				return coursetype != null;
			case LobjPackage.COURSE__OUTLINE_AS_XML:
				return OUTLINE_AS_XML_EDEFAULT == null ? outlineAsXml != null : !OUTLINE_AS_XML_EDEFAULT.equals(outlineAsXml);
			case LobjPackage.COURSE__MODULE:
				return module != null && !module.isEmpty();
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
		result.append(" (outlineAsXml: ");
		result.append(outlineAsXml);
		result.append(')');
		return result.toString();
	}

} //CourseImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package lobj.impl;

import lobj.AbstractContent;
import lobj.Language;
import lobj.LobjPackage;
import lobj.Source;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Abstract Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link lobj.impl.AbstractContentImpl#getHeading <em>Heading</em>}</li>
 * <li>{@link lobj.impl.AbstractContentImpl#getLanguage <em>Language</em>}</li>
 * <li>{@link lobj.impl.AbstractContentImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class AbstractContentImpl extends LearningObjectImpl implements AbstractContent {
	/**
	 * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected String heading = HEADING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Language language;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AbstractContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.ABSTRACT_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHeading(String newHeading) {
		String oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ABSTRACT_CONTENT__HEADING,
					oldHeading, heading));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Language getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject) language;
			language = (Language) eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							LobjPackage.ABSTRACT_CONTENT__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Language basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLanguage(Language newLanguage) {
		Language oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ABSTRACT_CONTENT__LANGUAGE,
					oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LobjPackage.ABSTRACT_CONTENT__SOURCE, oldSource, newSource);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSource(Source newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- LobjPackage.ABSTRACT_CONTENT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- LobjPackage.ABSTRACT_CONTENT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.ABSTRACT_CONTENT__SOURCE,
					newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case LobjPackage.ABSTRACT_CONTENT__SOURCE:
			return basicSetSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LobjPackage.ABSTRACT_CONTENT__HEADING:
			return getHeading();
		case LobjPackage.ABSTRACT_CONTENT__LANGUAGE:
			if (resolve)
				return getLanguage();
			return basicGetLanguage();
		case LobjPackage.ABSTRACT_CONTENT__SOURCE:
			return getSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LobjPackage.ABSTRACT_CONTENT__HEADING:
			setHeading((String) newValue);
			return;
		case LobjPackage.ABSTRACT_CONTENT__LANGUAGE:
			setLanguage((Language) newValue);
			return;
		case LobjPackage.ABSTRACT_CONTENT__SOURCE:
			setSource((Source) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case LobjPackage.ABSTRACT_CONTENT__HEADING:
			setHeading(HEADING_EDEFAULT);
			return;
		case LobjPackage.ABSTRACT_CONTENT__LANGUAGE:
			setLanguage((Language) null);
			return;
		case LobjPackage.ABSTRACT_CONTENT__SOURCE:
			setSource((Source) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LobjPackage.ABSTRACT_CONTENT__HEADING:
			return HEADING_EDEFAULT == null ? heading != null : !HEADING_EDEFAULT.equals(heading);
		case LobjPackage.ABSTRACT_CONTENT__LANGUAGE:
			return language != null;
		case LobjPackage.ABSTRACT_CONTENT__SOURCE:
			return source != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (heading: ");
		result.append(heading);
		result.append(')');
		return result.toString();
	}

} // AbstractContentImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id: ChildrenBooksImpl.java,v 1.1 2007/12/13 06:52:44 mtaal Exp $
 */
package com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl;

import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.ChildrenBooks;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.PublisherDefinition;
import com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.TestPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Children Books</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ChildrenBooksImpl#getTitle
 * <em>Title</em>}</li>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ChildrenBooksImpl#getCartoon
 * <em>Cartoon</em>}</li>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ChildrenBooksImpl#getPopup
 * <em>Popup</em>}</li>
 * <li>
 * {@link com.ibm.websphere.appserver.schemas._6._0.ibm.portal.test.impl.ChildrenBooksImpl#getPublisherDefinitionRef
 * <em>Publisher Definition Ref</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ChildrenBooksImpl extends BookDefinitionImpl implements ChildrenBooks {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCartoon() <em>Cartoon</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCartoon()
	 * @generated
	 * @ordered
	 */
	protected static final String CARTOON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCartoon() <em>Cartoon</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getCartoon()
	 * @generated
	 * @ordered
	 */
	protected String cartoon = CARTOON_EDEFAULT;

	/**
	 * The default value of the '{@link #getPopup() <em>Popup</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getPopup()
	 * @generated
	 * @ordered
	 */
	protected static final String POPUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopup() <em>Popup</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getPopup()
	 * @generated
	 * @ordered
	 */
	protected String popup = POPUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublisherDefinitionRef() <em>Publisher Definition Ref</em>}
	 * ' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPublisherDefinitionRef()
	 * @generated
	 * @ordered
	 */
	protected PublisherDefinition publisherDefinitionRef;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ChildrenBooksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.CHILDREN_BOOKS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.CHILDREN_BOOKS__TITLE,
					oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCartoon() {
		return cartoon;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCartoon(String newCartoon) {
		String oldCartoon = cartoon;
		cartoon = newCartoon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.CHILDREN_BOOKS__CARTOON,
					oldCartoon, cartoon));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getPopup() {
		return popup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPopup(String newPopup) {
		String oldPopup = popup;
		popup = newPopup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.CHILDREN_BOOKS__POPUP,
					oldPopup, popup));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PublisherDefinition getPublisherDefinitionRef() {
		return publisherDefinitionRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setPublisherDefinitionRef(PublisherDefinition newPublisherDefinitionRef) {
		PublisherDefinition oldPublisherDefinitionRef = publisherDefinitionRef;
		publisherDefinitionRef = newPublisherDefinitionRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TestPackage.CHILDREN_BOOKS__PUBLISHER_DEFINITION_REF, oldPublisherDefinitionRef,
					publisherDefinitionRef));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TestPackage.CHILDREN_BOOKS__TITLE:
			return getTitle();
		case TestPackage.CHILDREN_BOOKS__CARTOON:
			return getCartoon();
		case TestPackage.CHILDREN_BOOKS__POPUP:
			return getPopup();
		case TestPackage.CHILDREN_BOOKS__PUBLISHER_DEFINITION_REF:
			return getPublisherDefinitionRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TestPackage.CHILDREN_BOOKS__TITLE:
			setTitle((String) newValue);
			return;
		case TestPackage.CHILDREN_BOOKS__CARTOON:
			setCartoon((String) newValue);
			return;
		case TestPackage.CHILDREN_BOOKS__POPUP:
			setPopup((String) newValue);
			return;
		case TestPackage.CHILDREN_BOOKS__PUBLISHER_DEFINITION_REF:
			setPublisherDefinitionRef((PublisherDefinition) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TestPackage.CHILDREN_BOOKS__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case TestPackage.CHILDREN_BOOKS__CARTOON:
			setCartoon(CARTOON_EDEFAULT);
			return;
		case TestPackage.CHILDREN_BOOKS__POPUP:
			setPopup(POPUP_EDEFAULT);
			return;
		case TestPackage.CHILDREN_BOOKS__PUBLISHER_DEFINITION_REF:
			setPublisherDefinitionRef((PublisherDefinition) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TestPackage.CHILDREN_BOOKS__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case TestPackage.CHILDREN_BOOKS__CARTOON:
			return CARTOON_EDEFAULT == null ? cartoon != null : !CARTOON_EDEFAULT.equals(cartoon);
		case TestPackage.CHILDREN_BOOKS__POPUP:
			return POPUP_EDEFAULT == null ? popup != null : !POPUP_EDEFAULT.equals(popup);
		case TestPackage.CHILDREN_BOOKS__PUBLISHER_DEFINITION_REF:
			return publisherDefinitionRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", cartoon: ");
		result.append(cartoon);
		result.append(", popup: ");
		result.append(popup);
		result.append(')');
		return result.toString();
	}

} // ChildrenBooksImpl

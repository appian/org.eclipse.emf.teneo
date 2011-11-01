/**
 * <copyright>
 * </copyright>
 *
 * $Id: ThemeNodeImpl.java,v 1.3 2007/03/28 13:57:10 mtaal Exp $
 */
package lobj.impl;

import java.util.Collection;

import lobj.LobjPackage;
import lobj.Node;
import lobj.Theme;
import lobj.ThemeNode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theme Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lobj.impl.ThemeNodeImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link lobj.impl.ThemeNodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link lobj.impl.ThemeNodeImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link lobj.impl.ThemeNodeImpl#getChildnodes <em>Childnodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThemeNodeImpl extends EObjectImpl implements ThemeNode {
	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

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
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected Theme theme = null;

	/**
	 * The cached value of the '{@link #getChildnodes() <em>Childnodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildnodes()
	 * @generated
	 * @ordered
	 */
	protected EList childnodes = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThemeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LobjPackage.Literals.THEME_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.THEME_NODE__VISIBLE, oldVisible, visible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.THEME_NODE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme getTheme() {
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheme(Theme newTheme, NotificationChain msgs) {
		Theme oldTheme = theme;
		theme = newTheme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LobjPackage.THEME_NODE__THEME, oldTheme, newTheme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheme(Theme newTheme) {
		if (newTheme != theme) {
			NotificationChain msgs = null;
			if (theme != null)
				msgs = ((InternalEObject)theme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LobjPackage.THEME_NODE__THEME, null, msgs);
			if (newTheme != null)
				msgs = ((InternalEObject)newTheme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LobjPackage.THEME_NODE__THEME, null, msgs);
			msgs = basicSetTheme(newTheme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LobjPackage.THEME_NODE__THEME, newTheme, newTheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChildnodes() {
		if (childnodes == null) {
			childnodes = new EObjectContainmentEList(Node.class, this, LobjPackage.THEME_NODE__CHILDNODES);
		}
		return childnodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LobjPackage.THEME_NODE__THEME:
				return basicSetTheme(null, msgs);
			case LobjPackage.THEME_NODE__CHILDNODES:
				return ((InternalEList)getChildnodes()).basicRemove(otherEnd, msgs);
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
			case LobjPackage.THEME_NODE__VISIBLE:
				return isVisible() ? Boolean.TRUE : Boolean.FALSE;
			case LobjPackage.THEME_NODE__ID:
				return getId();
			case LobjPackage.THEME_NODE__THEME:
				return getTheme();
			case LobjPackage.THEME_NODE__CHILDNODES:
				return getChildnodes();
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
			case LobjPackage.THEME_NODE__VISIBLE:
				setVisible(((Boolean)newValue).booleanValue());
				return;
			case LobjPackage.THEME_NODE__ID:
				setId((String)newValue);
				return;
			case LobjPackage.THEME_NODE__THEME:
				setTheme((Theme)newValue);
				return;
			case LobjPackage.THEME_NODE__CHILDNODES:
				getChildnodes().clear();
				getChildnodes().addAll((Collection)newValue);
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
			case LobjPackage.THEME_NODE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case LobjPackage.THEME_NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case LobjPackage.THEME_NODE__THEME:
				setTheme((Theme)null);
				return;
			case LobjPackage.THEME_NODE__CHILDNODES:
				getChildnodes().clear();
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
			case LobjPackage.THEME_NODE__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case LobjPackage.THEME_NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LobjPackage.THEME_NODE__THEME:
				return theme != null;
			case LobjPackage.THEME_NODE__CHILDNODES:
				return childnodes != null && !childnodes.isEmpty();
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
		result.append(" (visible: ");
		result.append(visible);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ThemeNodeImpl

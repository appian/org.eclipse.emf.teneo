/**
 * <copyright>
 * </copyright>
 *
 * $Id: AnyImpl.java,v 1.2 2010/02/04 11:03:39 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.teneo.annotations.pannotation.Column;
import org.eclipse.emf.teneo.annotations.pannotation.FetchType;
import org.eclipse.emf.teneo.hibernate.hbannotation.Any;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Any</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.AnyImpl#getMetaDef <em>Meta Def</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.AnyImpl#getMetaColumn <em>Meta Column</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.AnyImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.impl.AnyImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnyImpl extends HbAnnotationImpl implements Any {
	/**
	 * The default value of the '{@link #getMetaDef() <em>Meta Def</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMetaDef()
	 * @generated
	 * @ordered
	 */
	protected static final String META_DEF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaDef() <em>Meta Def</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMetaDef()
	 * @generated
	 * @ordered
	 */
	protected String metaDef = META_DEF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetaColumn() <em>Meta Column</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMetaColumn()
	 * @generated
	 * @ordered
	 */
	protected Column metaColumn;

	/**
	 * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected static final FetchType FETCH_EDEFAULT = FetchType.EAGER;

	/**
	 * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetch()
	 * @generated
	 * @ordered
	 */
	protected FetchType fetch = FETCH_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AnyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HbannotationPackage.Literals.ANY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaDef() {
		return metaDef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaDef(String newMetaDef) {
		String oldMetaDef = metaDef;
		metaDef = newMetaDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbannotationPackage.ANY__META_DEF, oldMetaDef, metaDef));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Column getMetaColumn() {
		return metaColumn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaColumn(Column newMetaColumn, NotificationChain msgs) {
		Column oldMetaColumn = metaColumn;
		metaColumn = newMetaColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HbannotationPackage.ANY__META_COLUMN, oldMetaColumn, newMetaColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaColumn(Column newMetaColumn) {
		if (newMetaColumn != metaColumn) {
			NotificationChain msgs = null;
			if (metaColumn != null)
				msgs = ((InternalEObject)metaColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HbannotationPackage.ANY__META_COLUMN, null, msgs);
			if (newMetaColumn != null)
				msgs = ((InternalEObject)newMetaColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HbannotationPackage.ANY__META_COLUMN, null, msgs);
			msgs = basicSetMetaColumn(newMetaColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbannotationPackage.ANY__META_COLUMN, newMetaColumn, newMetaColumn));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FetchType getFetch() {
		return fetch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetch(FetchType newFetch) {
		FetchType oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbannotationPackage.ANY__FETCH, oldFetch, fetch));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HbannotationPackage.ANY__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case HbannotationPackage.ANY__META_COLUMN:
				return basicSetMetaColumn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HbannotationPackage.ANY__META_DEF:
				return getMetaDef();
			case HbannotationPackage.ANY__META_COLUMN:
				return getMetaColumn();
			case HbannotationPackage.ANY__FETCH:
				return getFetch();
			case HbannotationPackage.ANY__OPTIONAL:
				return isOptional();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HbannotationPackage.ANY__META_DEF:
				setMetaDef((String)newValue);
				return;
			case HbannotationPackage.ANY__META_COLUMN:
				setMetaColumn((Column)newValue);
				return;
			case HbannotationPackage.ANY__FETCH:
				setFetch((FetchType)newValue);
				return;
			case HbannotationPackage.ANY__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HbannotationPackage.ANY__META_DEF:
				setMetaDef(META_DEF_EDEFAULT);
				return;
			case HbannotationPackage.ANY__META_COLUMN:
				setMetaColumn((Column)null);
				return;
			case HbannotationPackage.ANY__FETCH:
				setFetch(FETCH_EDEFAULT);
				return;
			case HbannotationPackage.ANY__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HbannotationPackage.ANY__META_DEF:
				return META_DEF_EDEFAULT == null ? metaDef != null : !META_DEF_EDEFAULT.equals(metaDef);
			case HbannotationPackage.ANY__META_COLUMN:
				return metaColumn != null;
			case HbannotationPackage.ANY__FETCH:
				return fetch != FETCH_EDEFAULT;
			case HbannotationPackage.ANY__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (metaDef: ");
		result.append(metaDef);
		result.append(", fetch: ");
		result.append(fetch);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} // AnyImpl

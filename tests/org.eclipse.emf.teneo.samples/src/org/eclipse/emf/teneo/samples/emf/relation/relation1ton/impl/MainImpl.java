/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainImpl.java,v 1.3 2007/02/08 23:09:18 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Main;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneCR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.OneNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.Relation1tonPackage;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoCR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNN;
import org.eclipse.emf.teneo.samples.emf.relation.relation1ton.TwoNR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl#getOnecr <em>Onecr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl#getOnecn <em>Onecn</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl#getOnenr <em>Onenr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl#getOnenn <em>Onenn</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl#getTwocr <em>Twocr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl#getTwocn <em>Twocn</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl#getTwonr <em>Twonr</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.relation.relation1ton.impl.MainImpl#getTwonn <em>Twonn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainImpl extends EObjectImpl implements Main {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "c1";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet = false;

	/**
	 * The cached value of the '{@link #getOnecr() <em>Onecr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnecr()
	 * @generated
	 * @ordered
	 */
	protected EList<OneCR> onecr = null;

	/**
	 * The cached value of the '{@link #getOnecn() <em>Onecn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnecn()
	 * @generated
	 * @ordered
	 */
	protected EList<OneCN> onecn = null;

	/**
	 * The cached value of the '{@link #getOnenr() <em>Onenr</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnenr()
	 * @generated
	 * @ordered
	 */
	protected EList<OneNR> onenr = null;

	/**
	 * The cached value of the '{@link #getOnenn() <em>Onenn</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnenn()
	 * @generated
	 * @ordered
	 */
	protected EList<OneNN> onenn = null;

	/**
	 * The cached value of the '{@link #getTwocr() <em>Twocr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwocr()
	 * @generated
	 * @ordered
	 */
	protected EList<TwoCR> twocr = null;

	/**
	 * The cached value of the '{@link #getTwocn() <em>Twocn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwocn()
	 * @generated
	 * @ordered
	 */
	protected EList<TwoCN> twocn = null;

	/**
	 * The cached value of the '{@link #getTwonr() <em>Twonr</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwonr()
	 * @generated
	 * @ordered
	 */
	protected EList<TwoNR> twonr = null;

	/**
	 * The cached value of the '{@link #getTwonn() <em>Twonn</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTwonn()
	 * @generated
	 * @ordered
	 */
	protected EList<TwoNN> twonn = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Relation1tonPackage.Literals.MAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Relation1tonPackage.MAIN__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Relation1tonPackage.MAIN__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneCR> getOnecr() {
		if (onecr == null) {
			onecr = new EObjectContainmentEList<OneCR>(OneCR.class, this, Relation1tonPackage.MAIN__ONECR);
		}
		return onecr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneCN> getOnecn() {
		if (onecn == null) {
			onecn = new EObjectContainmentEList<OneCN>(OneCN.class, this, Relation1tonPackage.MAIN__ONECN);
		}
		return onecn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneNR> getOnenr() {
		if (onenr == null) {
			onenr = new EObjectEList<OneNR>(OneNR.class, this, Relation1tonPackage.MAIN__ONENR);
		}
		return onenr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneNN> getOnenn() {
		if (onenn == null) {
			onenn = new EObjectEList<OneNN>(OneNN.class, this, Relation1tonPackage.MAIN__ONENN);
		}
		return onenn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TwoCR> getTwocr() {
		if (twocr == null) {
			twocr = new EObjectContainmentWithInverseEList<TwoCR>(TwoCR.class, this, Relation1tonPackage.MAIN__TWOCR, Relation1tonPackage.TWO_CR__MAIN);
		}
		return twocr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TwoCN> getTwocn() {
		if (twocn == null) {
			twocn = new EObjectContainmentWithInverseEList<TwoCN>(TwoCN.class, this, Relation1tonPackage.MAIN__TWOCN, Relation1tonPackage.TWO_CN__MAIN);
		}
		return twocn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TwoNR> getTwonr() {
		if (twonr == null) {
			twonr = new EObjectWithInverseEList<TwoNR>(TwoNR.class, this, Relation1tonPackage.MAIN__TWONR, Relation1tonPackage.TWO_NR__MAIN);
		}
		return twonr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TwoNN> getTwonn() {
		if (twonn == null) {
			twonn = new EObjectWithInverseEList<TwoNN>(TwoNN.class, this, Relation1tonPackage.MAIN__TWONN, Relation1tonPackage.TWO_NN__MAIN);
		}
		return twonn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Relation1tonPackage.MAIN__TWOCR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTwocr()).basicAdd(otherEnd, msgs);
			case Relation1tonPackage.MAIN__TWOCN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTwocn()).basicAdd(otherEnd, msgs);
			case Relation1tonPackage.MAIN__TWONR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTwonr()).basicAdd(otherEnd, msgs);
			case Relation1tonPackage.MAIN__TWONN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTwonn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Relation1tonPackage.MAIN__ONECR:
				return ((InternalEList<?>)getOnecr()).basicRemove(otherEnd, msgs);
			case Relation1tonPackage.MAIN__ONECN:
				return ((InternalEList<?>)getOnecn()).basicRemove(otherEnd, msgs);
			case Relation1tonPackage.MAIN__TWOCR:
				return ((InternalEList<?>)getTwocr()).basicRemove(otherEnd, msgs);
			case Relation1tonPackage.MAIN__TWOCN:
				return ((InternalEList<?>)getTwocn()).basicRemove(otherEnd, msgs);
			case Relation1tonPackage.MAIN__TWONR:
				return ((InternalEList<?>)getTwonr()).basicRemove(otherEnd, msgs);
			case Relation1tonPackage.MAIN__TWONN:
				return ((InternalEList<?>)getTwonn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Relation1tonPackage.MAIN__NAME:
				return getName();
			case Relation1tonPackage.MAIN__ONECR:
				return getOnecr();
			case Relation1tonPackage.MAIN__ONECN:
				return getOnecn();
			case Relation1tonPackage.MAIN__ONENR:
				return getOnenr();
			case Relation1tonPackage.MAIN__ONENN:
				return getOnenn();
			case Relation1tonPackage.MAIN__TWOCR:
				return getTwocr();
			case Relation1tonPackage.MAIN__TWOCN:
				return getTwocn();
			case Relation1tonPackage.MAIN__TWONR:
				return getTwonr();
			case Relation1tonPackage.MAIN__TWONN:
				return getTwonn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Relation1tonPackage.MAIN__NAME:
				setName((String)newValue);
				return;
			case Relation1tonPackage.MAIN__ONECR:
				getOnecr().clear();
				getOnecr().addAll((Collection<? extends OneCR>)newValue);
				return;
			case Relation1tonPackage.MAIN__ONECN:
				getOnecn().clear();
				getOnecn().addAll((Collection<? extends OneCN>)newValue);
				return;
			case Relation1tonPackage.MAIN__ONENR:
				getOnenr().clear();
				getOnenr().addAll((Collection<? extends OneNR>)newValue);
				return;
			case Relation1tonPackage.MAIN__ONENN:
				getOnenn().clear();
				getOnenn().addAll((Collection<? extends OneNN>)newValue);
				return;
			case Relation1tonPackage.MAIN__TWOCR:
				getTwocr().clear();
				getTwocr().addAll((Collection<? extends TwoCR>)newValue);
				return;
			case Relation1tonPackage.MAIN__TWOCN:
				getTwocn().clear();
				getTwocn().addAll((Collection<? extends TwoCN>)newValue);
				return;
			case Relation1tonPackage.MAIN__TWONR:
				getTwonr().clear();
				getTwonr().addAll((Collection<? extends TwoNR>)newValue);
				return;
			case Relation1tonPackage.MAIN__TWONN:
				getTwonn().clear();
				getTwonn().addAll((Collection<? extends TwoNN>)newValue);
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
			case Relation1tonPackage.MAIN__NAME:
				unsetName();
				return;
			case Relation1tonPackage.MAIN__ONECR:
				getOnecr().clear();
				return;
			case Relation1tonPackage.MAIN__ONECN:
				getOnecn().clear();
				return;
			case Relation1tonPackage.MAIN__ONENR:
				getOnenr().clear();
				return;
			case Relation1tonPackage.MAIN__ONENN:
				getOnenn().clear();
				return;
			case Relation1tonPackage.MAIN__TWOCR:
				getTwocr().clear();
				return;
			case Relation1tonPackage.MAIN__TWOCN:
				getTwocn().clear();
				return;
			case Relation1tonPackage.MAIN__TWONR:
				getTwonr().clear();
				return;
			case Relation1tonPackage.MAIN__TWONN:
				getTwonn().clear();
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
			case Relation1tonPackage.MAIN__NAME:
				return isSetName();
			case Relation1tonPackage.MAIN__ONECR:
				return onecr != null && !onecr.isEmpty();
			case Relation1tonPackage.MAIN__ONECN:
				return onecn != null && !onecn.isEmpty();
			case Relation1tonPackage.MAIN__ONENR:
				return onenr != null && !onenr.isEmpty();
			case Relation1tonPackage.MAIN__ONENN:
				return onenn != null && !onenn.isEmpty();
			case Relation1tonPackage.MAIN__TWOCR:
				return twocr != null && !twocr.isEmpty();
			case Relation1tonPackage.MAIN__TWOCN:
				return twocn != null && !twocn.isEmpty();
			case Relation1tonPackage.MAIN__TWONR:
				return twonr != null && !twonr.isEmpty();
			case Relation1tonPackage.MAIN__TWONN:
				return twonn != null && !twonn.isEmpty();
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
		result.append(" (name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MainImpl

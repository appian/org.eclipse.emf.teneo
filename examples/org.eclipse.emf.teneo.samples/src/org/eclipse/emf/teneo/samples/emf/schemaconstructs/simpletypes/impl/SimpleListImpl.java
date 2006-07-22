/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleListImpl.java,v 1.2 2006/07/22 13:01:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpleList;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getBoo <em>Boo</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getByt <em>Byt</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getDoubl <em>Doubl</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getFloa <em>Floa</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getInte <em>Inte</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getLong <em>Long</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getShor <em>Shor</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getDat <em>Dat</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.impl.SimpleListImpl#getLimitedstring <em>Limitedstring</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleListImpl extends EObjectImpl implements SimpleList {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = "c1";

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * This is true if the Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeESet = false;

	/**
	 * The cached value of the '{@link #getBoo() <em>Boo</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoo()
	 * @generated
	 * @ordered
	 */
	protected EList boo = null;

	/**
	 * The cached value of the '{@link #getByt() <em>Byt</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByt()
	 * @generated
	 * @ordered
	 */
	protected EList byt = null;

	/**
	 * The cached value of the '{@link #getDoubl() <em>Doubl</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubl()
	 * @generated
	 * @ordered
	 */
	protected EList doubl = null;

	/**
	 * The cached value of the '{@link #getFloa() <em>Floa</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloa()
	 * @generated
	 * @ordered
	 */
	protected EList floa = null;

	/**
	 * The cached value of the '{@link #getInte() <em>Inte</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInte()
	 * @generated
	 * @ordered
	 */
	protected EList inte = null;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected EList long_ = null;

	/**
	 * The cached value of the '{@link #getShor() <em>Shor</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShor()
	 * @generated
	 * @ordered
	 */
	protected EList shor = null;

	/**
	 * The cached value of the '{@link #getDat() <em>Dat</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDat()
	 * @generated
	 * @ordered
	 */
	protected EList dat = null;

	/**
	 * The cached value of the '{@link #getLimitedstring() <em>Limitedstring</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitedstring()
	 * @generated
	 * @ordered
	 */
	protected EList limitedstring = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimpletypesPackage.Literals.SIMPLE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		boolean oldCodeESet = codeESet;
		codeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpletypesPackage.SIMPLE_LIST__CODE, oldCode, code, !oldCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCode() {
		String oldCode = code;
		boolean oldCodeESet = codeESet;
		code = CODE_EDEFAULT;
		codeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SimpletypesPackage.SIMPLE_LIST__CODE, oldCode, CODE_EDEFAULT, oldCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCode() {
		return codeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBoo() {
		if (boo == null) {
			boo = new EDataTypeEList(Boolean.class, this, SimpletypesPackage.SIMPLE_LIST__BOO);
		}
		return boo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getByt() {
		if (byt == null) {
			byt = new EDataTypeEList(Byte.class, this, SimpletypesPackage.SIMPLE_LIST__BYT);
		}
		return byt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDoubl() {
		if (doubl == null) {
			doubl = new EDataTypeEList(Double.class, this, SimpletypesPackage.SIMPLE_LIST__DOUBL);
		}
		return doubl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFloa() {
		if (floa == null) {
			floa = new EDataTypeEList(Float.class, this, SimpletypesPackage.SIMPLE_LIST__FLOA);
		}
		return floa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInte() {
		if (inte == null) {
			inte = new EDataTypeEList(Integer.class, this, SimpletypesPackage.SIMPLE_LIST__INTE);
		}
		return inte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLong() {
		if (long_ == null) {
			long_ = new EDataTypeEList(Long.class, this, SimpletypesPackage.SIMPLE_LIST__LONG);
		}
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getShor() {
		if (shor == null) {
			shor = new EDataTypeEList(Short.class, this, SimpletypesPackage.SIMPLE_LIST__SHOR);
		}
		return shor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDat() {
		if (dat == null) {
			dat = new EDataTypeEList(Date.class, this, SimpletypesPackage.SIMPLE_LIST__DAT);
		}
		return dat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLimitedstring() {
		if (limitedstring == null) {
			limitedstring = new EDataTypeEList(String.class, this, SimpletypesPackage.SIMPLE_LIST__LIMITEDSTRING);
		}
		return limitedstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpletypesPackage.SIMPLE_LIST__CODE:
				return getCode();
			case SimpletypesPackage.SIMPLE_LIST__BOO:
				return getBoo();
			case SimpletypesPackage.SIMPLE_LIST__BYT:
				return getByt();
			case SimpletypesPackage.SIMPLE_LIST__DOUBL:
				return getDoubl();
			case SimpletypesPackage.SIMPLE_LIST__FLOA:
				return getFloa();
			case SimpletypesPackage.SIMPLE_LIST__INTE:
				return getInte();
			case SimpletypesPackage.SIMPLE_LIST__LONG:
				return getLong();
			case SimpletypesPackage.SIMPLE_LIST__SHOR:
				return getShor();
			case SimpletypesPackage.SIMPLE_LIST__DAT:
				return getDat();
			case SimpletypesPackage.SIMPLE_LIST__LIMITEDSTRING:
				return getLimitedstring();
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
			case SimpletypesPackage.SIMPLE_LIST__CODE:
				setCode((String)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__BOO:
				getBoo().clear();
				getBoo().addAll((Collection)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__BYT:
				getByt().clear();
				getByt().addAll((Collection)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__DOUBL:
				getDoubl().clear();
				getDoubl().addAll((Collection)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__FLOA:
				getFloa().clear();
				getFloa().addAll((Collection)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__INTE:
				getInte().clear();
				getInte().addAll((Collection)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__LONG:
				getLong().clear();
				getLong().addAll((Collection)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__SHOR:
				getShor().clear();
				getShor().addAll((Collection)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__DAT:
				getDat().clear();
				getDat().addAll((Collection)newValue);
				return;
			case SimpletypesPackage.SIMPLE_LIST__LIMITEDSTRING:
				getLimitedstring().clear();
				getLimitedstring().addAll((Collection)newValue);
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
			case SimpletypesPackage.SIMPLE_LIST__CODE:
				unsetCode();
				return;
			case SimpletypesPackage.SIMPLE_LIST__BOO:
				getBoo().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__BYT:
				getByt().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__DOUBL:
				getDoubl().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__FLOA:
				getFloa().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__INTE:
				getInte().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__LONG:
				getLong().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__SHOR:
				getShor().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__DAT:
				getDat().clear();
				return;
			case SimpletypesPackage.SIMPLE_LIST__LIMITEDSTRING:
				getLimitedstring().clear();
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
			case SimpletypesPackage.SIMPLE_LIST__CODE:
				return isSetCode();
			case SimpletypesPackage.SIMPLE_LIST__BOO:
				return boo != null && !boo.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__BYT:
				return byt != null && !byt.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__DOUBL:
				return doubl != null && !doubl.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__FLOA:
				return floa != null && !floa.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__INTE:
				return inte != null && !inte.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__LONG:
				return long_ != null && !long_.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__SHOR:
				return shor != null && !shor.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__DAT:
				return dat != null && !dat.isEmpty();
			case SimpletypesPackage.SIMPLE_LIST__LIMITEDSTRING:
				return limitedstring != null && !limitedstring.isEmpty();
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
		result.append(" (code: ");
		if (codeESet) result.append(code); else result.append("<unset>");
		result.append(", boo: ");
		result.append(boo);
		result.append(", byt: ");
		result.append(byt);
		result.append(", doubl: ");
		result.append(doubl);
		result.append(", floa: ");
		result.append(floa);
		result.append(", inte: ");
		result.append(inte);
		result.append(", long: ");
		result.append(long_);
		result.append(", shor: ");
		result.append(shor);
		result.append(", dat: ");
		result.append(dat);
		result.append(", limitedstring: ");
		result.append(limitedstring);
		result.append(')');
		return result.toString();
	}

} //SimpleListImpl
